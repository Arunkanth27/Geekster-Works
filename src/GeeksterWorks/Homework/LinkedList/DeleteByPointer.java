package GeeksterWorks.Homework.LinkedList;

public class DeleteByPointer {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(1);

        deleteByPointer(head.next);

        while(head!= null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
    }

    public static void deleteByPointer(Node pointer) {
        if(pointer.next == null) {
            pointer = null;
        } else {
            Node temp = pointer.next;
            pointer.key = temp.key;
            pointer.next = temp.next;
            temp = null;
        }
    }
}
