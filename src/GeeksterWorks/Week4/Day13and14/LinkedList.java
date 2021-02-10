package GeeksterWorks.Week4.Day13and14;

public class LinkedList {

    Node head;
    int size;
    Node tail;

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
            while(current != null) {
                System.out.print(current.key + "->");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public int size() {
        return size;
    }

    public int getFirst() {
        if(size == 0) {
            return -1;
        }
        return head.key;
    }

    public int getLast() {
        if(size == 0) {
            return -1;
        }

        return tail.key;
    }

    public int getValueIndex(int idx){
        if(idx < 0 || idx >= size) {
            return -1;
        }

        int i = 0;
        Node current = head;
        while(i < idx) {
            current = current.next;
            i++;
        }
        return current.key;
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

    public Node reverse(Node node) {
        Node pre = null;
        Node current = node;
        while(current != null) {
            Node nextnode = current.next;
            current.next = pre;
            pre = current;
            current = nextnode;
        }
        return pre;
    }

    public Node getNode(int idx) {
        if(idx < 0 || idx >= size) {
            return null;
        }

        int i = 0;
        Node current = head;
        while(i < idx) {
            current = current.next;
            i++;
        }
        return current;
    }

    public void reverseByIterative() {
//        List<Integer> list = new ArrayList<>();
//        Node current = head;
//        while(current != null) {
//            list.add(current.key);
//            current = current.next;
//        }
//        int j = list.size() - 1;
//        current = head;
//        while(current != null) {
//            current.key = list.get(j);
//            current = current.next;
//            j--;
//        }

        int left = 0;
        int right = size - 1;

        while(left < right) {
            Node leftNode = getNode(left);
            Node rightNode = getNode(right);

            int temp = leftNode.key;
            leftNode.key = rightNode.key;
            rightNode.key = temp;
            left += 1;
            right -= 1;
        }

    }

    //Changes List
    public boolean isPalindrome() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverse(slow);

        while(slow != null) {
            if(slow.key != fast.key) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private Node leftHelper; // Class Variable (Global-Ref)
    public boolean isPalindromeRecursive() {
        leftHelper = head;
        return helper(this.head);
    }

    private boolean helper(Node right) {
        if(right == null) {
            return true;
        }
        boolean check = helper(right.next);
        if(!check) {
            return false;
        }
        if(leftHelper.key != right.key) {
            return false;
        }
        leftHelper = leftHelper.next;
        return true;
    }

    public void listFold() {
        if(head == null || head.next == null) {
            return ;
        }

        Node dummy = new Node(-1);
        Node current = dummy;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        Node temp = slow;
        slow = reverse(slow);

        while(slow != null && temp != fast) {
            current.next = new Node(fast.key);
            current = current.next;
            current.next = new Node(slow.key);
            current = current.next;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow != null) {
            current.next = new Node(slow.key);
        }

        head = dummy.next;
    }

    public Node listFold(Node node) {
        if(node == null || node.next == null) {
            return head;
        }

        Node dummy = new Node(-1);
        Node current = dummy;
        Node slow = node;
        Node fast = node;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = node;
        Node temp = slow;
        slow = reverse(slow);

        while(slow != null && temp != fast) {
            current.next = new Node(fast.key);
            current = current.next;
            current.next = new Node(slow.key);
            current = current.next;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow != null) {
            current.next = new Node(slow.key);
        }

        return dummy.next;
    }


}
