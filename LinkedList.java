
public class LinkedList {	
	
	class nipun {
	    int data;
	    nipun next;

	    public nipun(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	 nipun head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void addnipun(int data) {
	        nipun newNode1 = new nipun(data);
	        if (head == null) {
	            head = newNode1;
	        } else {
	            nipun current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode1;
	        }
	    }
	    
	    public void printList() {
	        nipun current = head;
	        while (current != null) {
	            System.out.print(current.data + "yelo ");
	            current = current.next;
	        }
	        System.out.println("isme kya");
	    }
	
	    
	public static void main(String[] args) {
		 LinkedList myList = new LinkedList();
	        int[] values = {1, 2, 3, 4, 5, 6, 7};
	        for (int value : values) {
	            myList.addnipun(value);
	        }
	        myList.printList();
	}

}
