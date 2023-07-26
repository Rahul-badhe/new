package DoublyLinkedLIst;

public class Main {
	public static void main(String[] args) {
	
	DoublyLinkedlIst dl=new DoublyLinkedlIst();
	
	dl.insert(20);
	dl.insert(50);
	dl.insert(80);
	dl.insert(100);
	dl.insert(90);
	dl.insert(90);
	dl.insert(890);
	dl.insert(50);
	dl.insert(100);

	dl.display();
	
	dl.insert(62, 4);
	dl.insert(10, 5);
	dl.insert(49, 6);
	dl.insert(79, 8);
	
	dl.deletebyval(890);
	dl.display();
	
	dl.deletebyposition(90, 7);
	dl.display();
	}
}
