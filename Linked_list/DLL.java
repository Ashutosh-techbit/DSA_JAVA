
// ==================================== DOUBLY LINKED LIST ======================================
package Linked_list;

public class DLL {
    private Node head;

    // ==================================== node of a doubly linked list =================================================
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next=head;
        node.prev = null;
        if(head != null){
            head.prev=node;
        }
        head = node;
    }

    // ======================================= DISPLAY ===============================
    public void display(){
         Node node = head;
         while(node.next != null){
            System.out.print(node.value + " -> ");
            node = node.next;
         }
         System.out.println("END");
    }
}
