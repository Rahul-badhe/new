package SinglyLinkedList;
import java.util.Stack;

public class LinkedList {
	private Node head;
	
	public LinkedList()
	{
		head=null;
	}
	
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		
		if(newNode == null) { //memomry is full
			return false;
		}
		
		if(head==null)
		{
			head=newNode;
			return true;
		}
		
		Node last=head;
		while(last.getNext() !=null)
		{
			last=last.getNext();
		}
	last.setNext(newNode);
		return true;
	}
	
	public void display() {
		Node temp=head;
		while(temp != null){
			System.out.print(temp.getData() + " ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public boolean insert(int data,int position) {
		Node newNode=new Node(data);
		if(position < 1)
		{
			return false;
		}
		if(position == 1)
		{	
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		Node prev = head;
		for(int i = 1 ; i<position - 1 ; i++)
		{
			prev=prev.getNext();
			if(prev == null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
		
	}
	
	public void displayRev() {
		Node temp=head;
		Stack<Node> s =new Stack<Node>();
		while(temp != null)
		{
			s.push(temp);
			temp=temp.getNext();
		}
		while(! s.isEmpty()) {
			System.out.print(s.pop().getData() + " ");
		}
		System.out.println();
		}
	
	  public void displayRev(Node head) {
	        if(head == null) {
	            return;
	        }
	        displayRev(head.getNext());
	        System.out.print(head.getData()  +" ");
	    }
	  
	  
	  public boolean deletebyval(int data)
	  {
		  if(head==null)
		  {
			  return false;
		  }
		  if(head.getData()==data) {
			  head=head.getNext();
			  return true;
		  }
		  Node prev=head ;
		  Node	del=head;
		  while(del.getData() !=data)
		  {
			  prev=del;
			  del=del.getNext();
			  if(del == null) {
				  return false;
			  }
		  }
		  prev.setNext(del.getNext());
		  return true;
	  }
	  
	  public boolean deletebyposition(int position)
	  {
		  if(head == null || position<0) {
			  return false;
		  }
		  
		  if(position==1)
		  {
			  head=head.getNext();
			  return true;
		  }
		  Node prev=head;
		  for(int i=1 ; i<position - 1 ; i ++) {
			  prev=prev.getNext();
			  if(prev.getNext()==null) {
				  return false;
			  }
		  }
		  Node del=prev.getNext();
		  prev.setNext(del.getNext());
		  return true;
	  }

}
