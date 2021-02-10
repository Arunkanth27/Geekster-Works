package GeeksterWorks.Homework.LinkedList;

public class DeleteNthLastNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(1);

        solve(head, 3);

        while(head != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
    }

    private static void solve(Node head, int k) {
        Node slow = head;
        Node fast = head;

        while(k-- >= 0) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
    }
}
