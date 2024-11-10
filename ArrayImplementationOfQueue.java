public class ArrayImplementationOfQueue {
      public static class queueA{
         int front=-1;
         int rear=-1;
         int size=0;
         int[] arr=new int[100];
//Adding value
         public void add(int val){
          if(rear==arr.length-1){
                    System.out.println("Queue is full !");
                    return;
          }
          if(front==-1){ //Queue is Empty
               front=rear=0;
               arr[0]=val;
          }else{
               arr[rear+1]=val;
               rear++;
            }
            size++;
         }
//Removing value
         public int remove(){
          if(size==0){
               System.out.println("Queue is empty!");
               return -1;
          }
           int x=arr[front];
           front++;
           size--;
           return x;
         }
// Returning peek
         public int peek(){
          if(size==0){
              System.out.println("Queue is empty!");
              return -1;
          }
          return arr[front];
         }

// Checking for Empty
         public boolean isEmpty(){
             return size==0;
         }

//Display queue
         public void display(){
           if(size==0) System.out.println("Queue is Empty");
           else{
              for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
              }
              System.out.println();
           }
         }
      }
      public static void main(String[] args) {
          queueA q=new queueA();
          q.add(1);
          q.add(2);
          q.add(3);
          q.add(4);
          q.display();
          q.remove();
          q.display();
          System.out.println(q.peek());
          System.out.println(q.size);

      }    
}
