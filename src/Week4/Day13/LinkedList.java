package Week4.Day13;

public class LinkedList {

    private Node head;
    private int size;
    private Node tail;

    public LinkedList() {
        size = 0;
    }

    class Node {
        Node next;
        int key;
        public Node(int key) {
            this.key = key;
        }
    }

    public void addFirst(int key) {
        addFirst(new Node(key));
        size += 1;
    }

    private void addFirst(Node node) {
        if(head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void add(int key) {
        addLast(new Node(key));
        size += 1;
    }

    public void addLast(int key) {
        addLast(new Node(key));
        size += 1;
    }

    private void addLast(Node node) {
        if(head == null) {
            addFirst(node);
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addAtPos(int key, int index) {
        addAtPos(new Node(key), index);
        size += 1;
    }

    private void addAtPos(Node node, int index) {
        if(index < 0 || index > size) {
            System.out.println("Invalid Position");
        } else if(index == 0) {
            addFirst(node);
        } else if(index == size) {
            addLast(node);
        } else {
            int idx = 0;
            Node current = head;
            while(idx < index - 1) {
                current = current.next;
                idx += 1;
            }
            Node nextNode = current.next;
            current.next = node;
            node.next = nextNode;
        }

    }

    public void removeFirst() {
        if(head != null) {
            if(size == 1) {
                head = null;
                tail = null;
            } else {
                Node nextNode = head.next;
                head = nextNode;

            }
            size -= 1;
        }
    }

    public void remove() {
        removeLast();
    }

    public void removeLast() {
        if(head != null) {
            if(size == 1) {
                removeFirst();
            } else {
                Node current = head;
                while(current.next.next != null) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
                size -= 1;
            }
        }
    }

    public void removeAtPos(int index) {
        if(index < 0 || index >= size) {
            System.out.println("Invalid Position");
        } else if(head != null) {
            if(index == 0) {
                removeFirst();
            } else if(index == size - 1) {
                remove();
            } else {
                int idx = 0;
                Node current = head;
                while(idx < index - 1) {
                    current = current.next;
                    idx += 1;
                }
                Node nextNode = current.next.next;
                current.next = nextNode;
                size -= 1;
            }
        }
    }

    public void printLinkedList() {
        Node current = head;
        if(current != null) {
            while(current.next != null) {
                System.out.print(current.key + "->");
                current = current.next;
            }
            System.out.print(current.key);
        }
    }

    public int size() {
        return size;
    }

    public int findMidWithSize() {
        if(head != null) {
            int mid;
            if(size % 2 == 0) {
                mid = size / 2;
            } else {
                mid = (size - 1)/ 2;
            }
            int count = 0;
            Node current = head;
            while(count < mid) {
                current = current.next;
                count += 1;
            }
            return current.key;
        } else {
            return -1;
        }
    }

    public int findMid() {
        if(head != null) {
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow.key;
        } else {
            return -1;
        }
    }

    public void reverse() {
        Node pre = null;
        Node current = head;
        while(current != null) {
            Node nextnode = current.next;
            current.next = pre;
            pre = current;
            current = nextnode;
        }
        head = pre;
    }
}
