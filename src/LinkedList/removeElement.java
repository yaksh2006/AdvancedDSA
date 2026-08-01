package LinkedList;

public class removeElement {
    public static Node RE(Node head, int k) {
        Node temp = head;
        Node a = new Node(head.val);
        Node alpha = a;
        while(temp != null) {
            if (temp.val != k) {
                alpha.next = new Node(temp.val);
                alpha = alpha.next;
            }
            temp = temp.next;
        }
        a = a.next;
        return a;
    }
    public static Node removedElement(Node head, int k) {
        return RE(head, k);
    }
}
