import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeque{

    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<String>();

        dq.add("Gopi");
        dq.add("Ganapathi");
        dq.addLast("Srini");
        dq.addFirst("Shankar");
        dq.add("prathap");

        System.out.println("Elements in Deque:"+dq);

        System.out.println("Removed element: "+dq.removeLast());

        System.out.println("Head: "+dq.element());

        System.out.println("poll(): "+dq.pollLast());

        System.out.println("peek(): "+dq.peek());
        
        System.out.println("Elements in Deque:"+dq);
    }
}
