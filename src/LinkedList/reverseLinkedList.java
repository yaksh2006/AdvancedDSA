package LinkedList;
import java.util.ArrayList;
public class reverseLinkedList {
    public Node reverseLinkList(Node head) {
        if(head == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Node a = new Node(list.get(list.size()-1));
        temp = a;
        for(int i=list.size()-2; i>=0; i--) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        return a;
    }
}
