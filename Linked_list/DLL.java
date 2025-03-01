
// ==================================== DOUBLY LINKED LIST ======================================
package Linked_list;

import java.util.LinkedList;

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

    // ================================ Insert node at start====================
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next=head;
        node.prev = null;
        if(head != null){
            head.prev=node;
        }
        head = node;
    }

    //=================================== Insert Node at end =============================
    public void insertEnd(int val){
        Node node = new Node(val);
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.next = null;
        node.prev = last;
    }

    // ==================================== INSERT after a particular value ================================
    public void insert(int value,int after){
          Node p = find(after);
          Node node =  new Node(value);

          if(p==null){
            System.out.println("doesnt exists");
            return;
          }

          node.next = p.next;
          p.next = node;
          node.prev = p;
          if(node.next != null){
            node.next.prev = node;
          }

    }



    // ===================================== FIND NODE ========================================
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

    // ======================================= DISPLAY ===============================
    public void display(){
         Node node = head;
         Node last  = null;
         while(node.next != null){
            last = node;
             System.out.print(node.value + " -> ");
             node = node.next;
         }
         System.out.println("END");

        //  ================================ Reverse of LinkedList ===============================
         System.out.println("LinkedList in Reverse");
         while (last != null) {
            System.out.print(last.value +" -> ");
            last = last.prev;
            
         }
         
          System.out.print("Start");

    }
}
