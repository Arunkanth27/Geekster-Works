package GeeksterWorks.Week5.Day15;

public class Merge_Two_Sorted_List {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(7);
        head2.next.next = new Node(10);
        head2.next.next.next = new Node(19);
        head2.next.next.next.next = new Node(22);

        Node result = solve(head, head2);

        while(result != null) {
            System.out.print(result.key + " ");
            result = result.next;
        }
    }

    private static Node solve(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        while(list1 != null && list2 != null) {
            if(list1.key < list2.key) {
                current.next = new Node(list1.key);
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = new Node(list2.key);
                current = current.next;
                list2 = list2.next;
            }
        }

        while(list1 != null) {
            current.next = new Node(list1.key);
            list1 = list1.next;
            current = current.next;
        }

        while(list2 != null) {
            current.next = new Node(list2.key);
            list2 = list2.next;
            current = current.next;
        }

        return dummy.next;
    }
}
