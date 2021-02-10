package GeeksterWorks.Week5.Day15;

public class Kth_Last_Node {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(solve(head, 1));

//        while(head != null) {
//            System.out.print(head.key + " ");
//            head = head.next;
//        }

    }

    private static int solve(Node head, int k) {
        Node slow = head;
        Node fast = head;

        while(k-- >= 0) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
//        slow.next = slow.next.next;
        return slow.next.key;
    }
}
