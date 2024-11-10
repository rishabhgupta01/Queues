// // (1) Reverse first k elements of a queue
// import java.util.*;
// // public class Questions {
// //    public static void main(String[] args) {
// //           Scanner a=new Scanner(System.in);
// //           System.out.print("Enter the value of k:");
// //           int k=a.nextInt();
// //           //Create a queue
// //           Queue<Integer> q=new LinkedList<>();
// //           q.add(1);
// //           q.add(2);
// //           q.add(3);
// //           q.add(4);
// //           q.add(5);
// //           System.out.println(q);
// //           //Create a stack
// //           Stack<Integer> st=new Stack<>();
// //           // Step 1: Dequeue the first k elements and push them onto the stack
// //           for(int i=0;i<k;i++){
// //               st.push(q.remove());
// //           }
// //           // Step 2: Enqueue the elements from the stack back to the queue
// //           while(!st.isEmpty()){
// //                q.add(st.pop());
// //           }

// //           //Remaining elements
// //           int rem=q.size()-k;
// //           for(int i=0;i<rem;i++){
// //               q.add(q.remove());
// //           }
// //           System.out.println(q);
// //    }       
// // }

