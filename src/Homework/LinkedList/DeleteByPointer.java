package Homework.LinkedList;

public class DeleteByPointer {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(1);

        deleteByPointer(head.next);

        while(head.next != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
    }

    public static void deleteByPointer(Node pointer) {
//        Node temp = pointer.next;
//        pointer.key = temp.key;
//        pointer.next = temp.next;
//        temp = null;

        while(pointer.next != null) {
            pointer.key = pointer.next.key;
            pointer = pointer.next;
        }
    }
}
