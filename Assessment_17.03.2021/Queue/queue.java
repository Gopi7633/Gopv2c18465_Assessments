import java.util.*;
public class Queue {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();

        q.add("Gopi");
        q.add("Ganapathi");
        q.add("Srini");
        q.add("Senthil");
        q.add("Shankar");

        System.out.println("Elements in Queue:"+q);


        System.out.println("Removed element: "+q.remove());


        System.out.println("Head: "+q.element());


        System.out.println("poll(): "+q.poll());


        System.out.println("peek(): "+q.peek());


        System.out.println("Elements in Queue:"+q);
    }
}
