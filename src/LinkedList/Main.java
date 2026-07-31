package LinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Choice what operation you want to perform: ");
        System.out.println("1 for reverse a Linked list: ");
        System.out.println("2 for add Two list and create a new reversed list: ");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter the size of an array as linked list");
                int n = in.nextInt();
                System.out.println("Enter an Array: ");
                int[] num = new int[n];
                for(int i=0; i<n; i++) {
                    num[i] = in.nextInt();
                }
                Node head = new Node(num[0]);
                Node temp = head;
                for(int i=1; i<n; i++) {
                    temp.next = new Node(num[i]);
                    temp = temp.next;
                }
                reverseLinkedList rls = new reverseLinkedList();
                temp = rls.reverseLinkList(head);
                boolean ischeck = true;
                while(temp != null) {
                    if(ischeck) {
                        System.out.print(temp.val);
                        temp = temp.next;
                        ischeck = false;
                    } else {
                        System.out.print("->" + temp.val);
                        temp = temp.next;
                    }
                }
                break;

            case 2:
                System.out.println("Enter the size of an array1 as linked list");
                int n1 = in.nextInt();
                System.out.println("Enter an Array: ");
                int[] num1 = new int[n1];
                for(int i=0; i<n1; i++) {
                    num1[i] = in.nextInt();
                }

                System.out.println("Enter the size of an array2 as linked list");
                int n2 = in.nextInt();
                System.out.println("Enter an Array: ");
                int[] num2 = new int[n2];
                for(int i=0; i<n2; i++) {
                    num2[i] = in.nextInt();
                }
                Node head1 = new Node(num1[0]);
                Node temp1 = head1;
                for(int i=1; i<n1; i++) {
                    temp1.next = new Node(num1[i]);
                    temp1 = temp1.next;
                }
                Node head2 = new Node(num2[0]);
                Node temp2 = head2;
                for(int i=1; i<n2; i++) {
                    temp2.next = new Node(num2[i]);
                    temp2 = temp2.next;
                }
                addLinkedList als = new addLinkedList();
                Node tem = als.addLinkList(head1, head2);
                boolean ischec = true;
                while(tem != null) {
                    if(ischec) {
                        System.out.print(tem.val);
                        tem = tem.next;
                        ischec = false;
                    } else {
                        System.out.print("->" + tem.val);
                        tem = tem.next;
                    }
                }
                break;

            default:
                System.out.println("It is Invalid choice");
        }
    }
}
