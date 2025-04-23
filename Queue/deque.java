import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(1);
        dq.addLast(3);
        dq.addLast(4);

        System.out.println(dq.peek());
        System.out.println(dq.removeLast());
        System.out.println(dq.removeFirst());

        
    }
}
