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

        list.display();
    }
}
