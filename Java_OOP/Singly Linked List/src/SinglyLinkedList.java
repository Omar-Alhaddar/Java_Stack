public class SinglyLinkedList {
    public Node head;

    public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = null;
	}
	// SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    
    public void remove() {
    	Node temp = head;
    	while (temp.next.next != null ) {
    		temp=temp.next;
    	}
    	Node last = temp.next.next;
    	temp.next = null;
    	last = null;
    	
    }
    
    public void printValues() {
    	Node x = this.head;
    	
    	while (x.next.next != null) {
    		String s = String.format("Node value: %s the next value: %s", x.value , x.next.value);
    		System.out.println(s);
    		x=x.next;
    	}
   		String s = String.format("Node value: %s the next value: null", x.value , x.next.value);
		System.out.println(s);
    	
    }
}