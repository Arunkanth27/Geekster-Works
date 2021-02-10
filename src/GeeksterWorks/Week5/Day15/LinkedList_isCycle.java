package GeeksterWorks.Week5.Day15;

public class LinkedList_isCycle {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node temp = head.next.next;
        head.next.next.next.next = temp;

        System.out.println(solve(head));
    }

    private static boolean solve(Node head) {
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow.key == fast.key) {
                return true;
            }
        }
        return false;
    }
}
