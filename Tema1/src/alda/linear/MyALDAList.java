package alda.linear;

public class MyALDAList<T> {

	private static class Node<T>{
		T data; 
		Node next; 
		
		public Node (T data) {
			this.data = data; 
		}
	}
	
	private Node <T> first; 
	private Node <T> last; 
	
	// ej implementerad 
	public void add (T data) {
		if (first == null) {
			first = new Node <T> (data); 
		}else {
			last.next = new Node <T>(data); 
			last = last.next; 			
		}
	}
	
	// ej implementerad 
	public void add (int index, T data) {
		
	}
	// ej implementerad 
	public T remove (int index) {
		return null; 
	}
	// ej implementerad 
	public boolean remove (T data) {
		return false; 
	}
	// ej implementerad 
	public T get (int index) {
		return null; 
	}
	// ej implementerad 
	public boolean contains (T data) {
		return false; 
	}
	// ej implementerad 
	public int indexOf (T data) {
		return 0; 
	}
	// ej implementerad 	
	public void clear() {
		 
	}
	// ej implementerad 
	public int size() {
		return 0; 
	}
}
