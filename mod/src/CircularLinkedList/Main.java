package CircularLinkedList;

public class Main {
	public static void main(String[] args) {
		CircularLinkedList cl=new CircularLinkedList();
		
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);
		
		cl.display();
		
//		cl.display(1,11);
		cl.insert(1,11);
		cl.insert(3, 33);
		cl.insert(5, 55);
		cl.insert(7,77);
		cl.display();
	}
}
