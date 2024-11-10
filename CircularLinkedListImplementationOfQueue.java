public class CircularLinkedListImplementationOfQueue {
          public static class Node{
                    int data;
                    Node next;
                    public Node(int data){
                              this.data=data;
                              next=null;
                    }
          }
          public static class Cql{
            Node head=null;
            Node tail=null;
            int size=0;
            //Adding element 
            public void add(int val){
               Node a=new Node(val);
               if(size==0){
                  head=tail=a;
                  tail.next=head;
               }else{
                 a.next=head;
                 tail.next=a;   
                 tail=a;
               }
               size++;
            }

            //Remove element
            public int remove() {
               if (size == 0) {
                   System.out.println("Queue is Empty!");
                   return -1;
               } else {
                   int x = head.data;
                   if (size == 1) { // if there's only one node
                       head = tail = null; // queue is now empty
                   } else {
                       head = head.next;
                       tail.next = head;
                   }
                   size--;
                   return x;
               }
           }

           // Peek at the front element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data; // Return the data of the head node
        }

          //Display
          public void display() {
            if (head == null) {
                System.out.println("Empty!");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }     
 }
   public static void main(String[] args) {
       Cql q=new Cql();
       q.display();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.display();
       q.remove();
       q.display();
       System.out.println(q.peek());
   }
}
