package CircularLinkedList;

public class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		head=null;
		
	}
	
	public boolean insert(int data)
	{
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		if(head == null)
		{
			head=newNode;
			newNode.setNext(newNode);
			return true;
		}
		
		Node last=head;
		while(last.getNext() != head) {
			last=last.getNext();
		}
		
		last.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	
	public boolean display() {
		if(head==null) {
			return false;
		}
		
		Node temp=head;
		while(temp.getNext() != head) {
			System.out.print(temp.getData() + " ");
			temp=temp.getNext();
		}
		System.out.println("  ");
		return true;		
	}
	public boolean insert(int position , int data) { 
		if(position <= 0 || (head==null && position >1)) {
			return false;
		}
		
	    Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }
        
		if(position == 1 )
		{
			//is list is empty
			if(head == null) {
				head=newNode;
				newNode.setNext(head);
				return true;
			}
			//list is not empty
			newNode.setNext(head);
			Node last=head;
			while(last.getNext() != head) {
				last=last.getNext();
		
			}
			last.setNext(newNode);
			head=newNode;
			return true;
		}
		Node prev = head;
		for(int i =1 ; i<position -1 ; i++ ) {
			prev=prev.getNext();
			if(prev==head) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
}










