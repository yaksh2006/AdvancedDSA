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

            default:
                System.out.println("Invalid choice");
        }
    }
}
