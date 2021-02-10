package GeeksterWorks.Week5.Day15;

public class LinkedListReverse_Recursion {
    static Node left;
    static int size;
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        solve(head);

        while(head != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }

    }

    public static void solve(Node head) {
        left = head;
        size = size(head);
        helper(head, 0);
    }

    public static int size(Node head) {
        Node current = head;
        int count = 0;
        while(current != null) {
            count += 1;
            current = current.next;
        }
        return count;
    }

    public static void helper(Node right, int floor) {
        if(right == null) {
            return;
        }
        helper(right.next, floor + 1);
        if(floor >= size / 2) {
            int temp = left.key;
            left.key = right.key;
            right.key = temp;
            left = left.next;
        }
    }
}
