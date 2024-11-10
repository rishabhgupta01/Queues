import java.util.*;

//Print all elements present in given queue only using add(), remove(),peek(),size() and extra queue.
public class question {
    public static void main(String[] args) {
      Queue<Integer> q=new ArrayDeque<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);   
      Queue<Integer> s=new ArrayDeque<>();
      while(!q.isEmpty()){
         s.add(q.remove());
      }  
      while(!s.isEmpty()){
         int x=s.remove();
         System.out.print(x+" ");
         q.add(x);
      }
    }      
}
