import java.util.Stack;
// import java.util.Stack;
// // Push Efficient 
// public class StackImplementationOFQueue {
//           public static class Qst{
//            Stack<Integer> st=new Stack<>();
//            Stack<Integer> gt=new Stack<>();

//           //  Adding Element
//           public void add(int x){ // T.C--> O(1)
//             st.push(x);
//           }

//           // Removing Element
//           public int pop(){ // T.C--> O(n)
//             while(st.size()>1){
//                     gt.push(st.pop());
//             }
//             int x=st.pop();
//             while(!gt.isEmpty()){
//                 st.push(gt.pop());
//             }
//             return x;
//           }

//           // Getting Peek
//           public int peek(){ //T.C-->O(n)
//             while(st.size()>1){
//                gt.push(st.pop());
//             }
//             int x=st.peek();
//             while(!gt.isEmpty()){
//                st.push(gt.pop());
//             }
//             return x;
//           }

//           // Is Empty
//           public boolean empty(){
//             if(st.size()==0) return true;
//             else return false;
//           }
 
//           // Printing the queue
//           public void display() {
//                     // Printing the elements in the stack without removing them
//           for (int i = 0; i < st.size(); i++) {
//               System.out.print(st.get(i) + " ");
//           }
//           System.out.println();
//             }
//           }
//   public static void main(String[] args) {
//       Qst q=new Qst();
//       q.add(1);
//       q.add(2);
//       q.add(3);
//       q.add(4);
//       q.display();
//       System.out.println(q.pop());
//       System.out.println(q.peek());
//       System.out.println(q.empty()); 
//   }  
// }

// POP efficient
public class StackImplementationOFQueue{
    public static class que{
      Stack<Integer> s1=new Stack<>();
      Stack<Integer> s2=new Stack<>();
     //Adding the element
      public  void add(int x){ // T.C--> O(n)
          while(!s1.isEmpty()){
             s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
             s1.push(s2.pop());
            }
          } 
      //Removing the element 
      public  int remove(){ // T.C-->O(1)
          if(s1.isEmpty()){
            System.out.println("Queue is Empty");
                    return -1;
          }
          return s1.pop();
      }
      // Returning the peek element
      public  int peek(){ // T.C-->O(1)
          if(s1.isEmpty()){
            System.out.println("Queue is Empty");
              return -1;
                  }
          return s1.peek();
      }

      // Queue is Empty or not
      public boolean isEmpty(){
          return s1.isEmpty();
      }
    }
    public static void main(String[] args) {
        que q=new que();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        while(!q.isEmpty()){
          System.out.print(q.peek()+" ");
          q.remove();
        }
   }
}