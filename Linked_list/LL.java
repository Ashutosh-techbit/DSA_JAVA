package Linked_list;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    // size
    public LL(){
        this.size = 0;
    }

    //insert in begining
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node; // now new node will be head

        //no elements exsist before
        if(tail==null){
            tail = head;
        }
        size += 1;
    }

    // insert node at end
    public void insertend(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node temp = new Node(value);
        tail.next = temp;
        tail = temp;
        size++;
    }

    //insert at particular index
    public void insertAtIndex(int value , int index){
        if(head==null){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertend(value);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next=node;
    }

    //display whole linklist
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
    
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next  = next;
        }
        
    }
}
