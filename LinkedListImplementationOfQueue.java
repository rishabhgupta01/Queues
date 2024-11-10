public class LinkedListImplementationOfQueue {
         public static class Node{
            int data;
            Node next;

            Node(int data){
             this.data=data;
             }
          }
    public static class queue{
          Node head=null;
          Node tail=null;
          int size=0;

          //Adding element
          void add(int x){
            Node a=new Node(x);
            if(size==0){
               head=tail=a;
            }else{
             tail.next=a;
             tail=a;
            }
            size++;
          }

//Getting peek
          public int peek(){
             if(size==0){
                    System.out.println("Queue is Empty!");
                    return -1;
             }
             return head.data;
          }
//Removing element
          public int remove(){
             if(size==0){
                    System.out.println("Queue is Empty!");
                    return -1;
             }
             int x=head.data;
             head=head.next;
             size--;
             return x;
          }
//Display the queue
          public void display(){
            Node temp=head;
            if(head==null){
                    System.out.println("Empty!");
            }else{
                    while(temp!=null){
                       System.out.print(temp.data+" ");
                       temp=temp.next;
                    }
                    System.out.println();
             }
          }
// Checking queue is empty 
          public boolean isEmpty(){
              return size==0;
          }
}
     public static void main(String[] args) {
      queue q=new queue();
      q.display();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.display();
      System.out.println(q.peek());
      q.remove();
      q.display();
      System.out.println(q.isEmpty());
      System.out.println(q.size);
     }   
}
