import java.util.Stack;



public class CollectionFrmwrk {

    public static void pushAtBottom(int data , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.add(2, 6);
        s.addLast(0);
        pushAtBottom(12, s);
        s.push(3);


        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
