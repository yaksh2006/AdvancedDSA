package LinkedList;

public class Display {
    public static void display(Node head) {
        Node temp = head;
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
    }
}
