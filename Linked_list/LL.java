package Linked_list;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    // size
    public LL(){
        this.size = 0;
    }

    public Node find(int value){
        Node node = head;
        while (node != null) {
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    // ======================== INSERTION ==============================
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
        size++;
    }

    // ========================= DISPLAY =========================
    //display whole linklist
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // ======================== DELETE ==============================  
    //delete first node
    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        //if single element 
        if(head==null){
            tail = null;
        }
        size--;
        return val;
     }   

    //get pointer to particular index
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    //delete last node
    public int deletelast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;

    }

    //DELETE AT AN INDEX
    public int delete(int index){
        if(index == 0){
           return deleteFirst();
        }
        if(index == size-1){
            return deletelast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;

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
