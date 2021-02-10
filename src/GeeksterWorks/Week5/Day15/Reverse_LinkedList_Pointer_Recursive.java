package GeeksterWorks.Week5.Day15;

public class Reverse_LinkedList_Pointer_Recursive {
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

    public static void solve(Node node) {
        helper(node);
        Node head = node;
        Node tail = node;
        while(tail.next != null) {
            tail = tail.next;
        }
        int temp = head.key;
        head.key = tail.key;
        tail.key = temp;
        tail.next = null;
    }


    public static void helper(Node head) {
        if(head.next == null) {
            return;
        }
        helper(head.next);
        head.next.next = head;
        head = head.next;
    }

}
