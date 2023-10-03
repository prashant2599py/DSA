package LinkedLists;

public class LL {
    Node head;
    // Node Class
    public class Node{
        int data;
        Node next;

        // Node Constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Function to add new Node at first.
    public void addFirst(int data){
        // new Node created
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        // Check if head = null, then head points to new node. and return, if it is not so, then NewNode->next = head, and head = new Node.
        if(head == null){
            head = newNode;
            return;
        }
    }
    
    public void addInMiddle(int position, int data) {
    	Node temp = head;
    	int count = 1;
    	
    	//Insert at first
    	if(position == 1) {
    		addFirst(data);
    		return;
    	}
    	
    	while(count < position-1) {
    		temp = temp.next;
    		count++;
    	}
    	
    	// Inserting at last Position.
    	if(temp.next == null) {
    		addLast(data);
    		return;
    	}
    	
    	
    	//creating newNode for data
    	Node nodeToInsert = new Node(data);
    	
    	nodeToInsert.next = temp.next;
    	temp.next = nodeToInsert;
    			
    	
    }
        

    public void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    // Deletion of Node at first position
    public void deleteFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        head = head.next;

    }
    
//    public void deleteLast(int position){
//    	Node temp = head;
//    	if (temp == null)
//    	    return;
//    	
//    	// Deleting first or start Node
//    	if(position == 1) {
//    		
//    		head = head.next;
//    		temp.next = null;
//    	}
//    	else {
//    		//Deletion any middle node or last node
//    		Node curr = head;
//    		Node prev = null;
//    		int count = 1;
//    		
//    		while(count <= position) {
//    			prev = curr;
//    			curr = curr.next;
//    			count++;
//    		}
//    		prev.next = curr.next;
//    		curr.next = null;
//    		
//    	}
//    }
    
    public void deleteNode(int key) {
    	  Node temp = head, prev = null;
    	  if (temp != null && temp.data == key) {
    	    head = temp.next;
    	    return;
    	  }
    	  while (temp != null && temp.data != key) {
    	    prev = temp;
    	    temp = temp.next;
    	  }
    	  if (temp == null)
    	    return;
    	 
    	  prev.next = temp.next;
    	}


    public void printNode(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Object of LL
        LL list = new LL();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printNode();
        
        list.addLast(6);
        list.printNode();
        
        list.deleteFirst();
        list.printNode();
        
        list.addFirst(1);        
        list.printNode();
        
        list.addInMiddle(3, 4);
        list.printNode();
        
        list.addInMiddle(1, 21);
        list.printNode();
        
        list.addInMiddle(7, 90);
        list.printNode();
        
        list.deleteFirst();
        list.printNode();
        
        list.deleteNode(4);
        list.printNode();
        
        

    }
}
