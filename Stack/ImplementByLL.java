// package Stack;

public class ImplementByLL {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public  Node head = null;

        public  void push(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public  boolean isEmpty() {
            return head == null;
        }

        public  int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String[] args) {
         Stack s = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);

         while(!s.isEmpty()){
            System.out.println(s.pop());
         }
    }
}
