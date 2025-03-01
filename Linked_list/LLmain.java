package Linked_list;

import java.util.LinkedList;

public class LLmain {
    public static void main(String[] args) {
        LL list = new LL();
         
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(15);
        list.insertFirst(18);
        list.insertFirst(19);
        list.insertend(99);
        list.insertAtIndex(56,3);

    //     list.display();
    //     System.out.println(list.deleteFirst());;
    //     list.display();
        
    //    System.out.println( list.deletelast());
    //     list.display();

    //     System.out.println(list.delete(1));
        list.display();

   //     System.out.println(list.find(18));



    }
}
