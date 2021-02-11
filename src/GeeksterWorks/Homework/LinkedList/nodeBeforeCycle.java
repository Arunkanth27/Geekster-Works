package GeeksterWorks.Homework.LinkedList;

public class nodeBeforeCycle {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;

        solve(head);

        while(head.next != null) {
            System.out.print(head.key + "->");
            head = head.next;
        }
        System.out.println(head.key);
    }

    public static void solve(Node head) {
        if(!isCycle(head)) {
            return;
        }
        Node slow = head;
        Node fast = head.next;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = null;
    }

    private static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;
//        makeCycle(list);
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
