 class reverseLinkedList {
	
	
		static Node head;
		
		static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				this.next = null;
			}
		}
		Node reverse (Node nd) {
			Node prev = null;
			Node current = nd;
			Node next = null;
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			nd = prev;
	
			
			return nd;
		}
		
		void  printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }


	
	
	public static void main(String[] args) {
		
		reverseLinkedList list = new reverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		
		list.printList(head);
		head = list.reverse(head);
		list.printList(head);
		
	}

}
