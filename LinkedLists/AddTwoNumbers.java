package LinkedLists;

public class AddTwoNumbers {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node doubleLinkedListNumber(Node head) {
        Node curr = head;
        Node prev = null;
        int carry = 0;

        while (curr != null) {
            int newValue = (curr.data * 2) + carry;
            carry = newValue / 10;
            curr.data = newValue % 10;

            prev = curr;
            curr = curr.next;
        }

        // If there's still a carry after traversing the list
        if (carry > 0) {
            prev.next = new Node(carry);
        }

        return head;
    }

    public static void printNode(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 5 -> 7 -> 9
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(9);

        System.out.println("Original Linked List:");
        printNode(head);

        // Double the linked list number
        Node doubledHead = doubleLinkedListNumber(head);

        System.out.println("Doubled Linked List:");
        printNode(doubledHead);
    }
}