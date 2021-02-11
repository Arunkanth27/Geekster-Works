package GeeksterWorks.Homework.LinkedList;

public class reverseInGroups {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node result = reverseInGroup(head, 3);

        while(result != null) {
            System.out.print(result.key + " ");
            result = result.next;
        }
    }

    private static Node reverseInGroup(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node nextNode = null;

        int count = 0;

        while(count < k && current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            count += 1;
        }

        if(nextNode != null) {
            head.next = reverseInGroup(nextNode, k);
        }

        return prev;
    }
}
