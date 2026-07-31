package LinkedList;

public class addLinkedList {

    public Node addLinkList(Node head1, Node head2) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        Node temp1 = head1;
        while (temp1 != null) {
            sb.append(temp1.val);
            temp1 = temp1.next;
        }

        Node temp2 = head2;
        while (temp2 != null) {
            sb1.append(temp2.val);
            temp2 = temp2.next;
        }

        long op = Long.parseLong(sb.reverse().toString())
                + Long.parseLong(sb1.reverse().toString());

        String str = new StringBuilder(String.valueOf(op))
                .reverse()
                .toString();

        Node head = new Node(str.charAt(str.length()-1) - '0');
        Node temp = head;

        for (int i = str.length()-2; i >= 0; i--) {
            temp.next = new Node(str.charAt(i) - '0');
            temp = temp.next;
        }

        return head;
    }
}