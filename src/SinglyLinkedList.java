
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
        return true;
    }

    


    public boolean insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    // Reverse the linked list
    public void reverse() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node n1 = head, n2 = head.getNext(), n3;
        while (n2 != null) {
            n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }
        head.setNext(null);
        head = n1;
    }


    public Node findMidElement() {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}   