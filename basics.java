import java.util.*;
public class basics{
     public static void main(String[] args) {
       Queue<Integer> q=new ArrayDeque<>();
       System.out.println(q.isEmpty()); // Checking queue is empty or not
       //Adding the element
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       //Size of the queue
       System.out.println(q.size());
       // Printing the queue
       System.out.println(q);
       // Removing element
       q.remove();
       System.out.println(q);
       q.poll();
       System.out.println(q);
       //Getting the peek element
       System.out.println(q.element());
     }
}