
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // Insertion
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        sll.insert(40);

    
       
        // Display the initial linked list
        sll.display();

        // Insert at the beginning
        sll.insertAtFirst(5);

        // Display the linked list after inserting at the beginning
        sll.display();

        // Reverse the linked list
        sll.reverse();

        // Display the reversed linked list
        sll.display();

        // Find the middle element
        Node midNode = sll.findMidElement();
        if (midNode != null) {
            System.out.println("Middle element: " + midNode.getData());
        } else {
            System.out.println("Linked list is empty.");
        }
    }  
}