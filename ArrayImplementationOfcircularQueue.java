public class ArrayImplementationOfcircularQueue {
      public static class Cqa{
         int front=-1;
         int rear=-1;
         int size=0;
         int[] arr=new int[5];

         //Adding element
         public void add(int data) throws Exception{
            if(size==arr.length){
                  throw new Exception("Queue is full");
            }else if(size==0){
                  front=rear=0;
                  arr[0]=data;
            }
            else if(rear<arr.length-1){
                  arr[++rear]=data;
            }else if(rear==arr.length-1){
                  rear=0;
                  arr[0]=data;
            }
            size++;
         }

         //Removing
         public int remove() throws Exception{
            if(size==0){
                 throw new Exception("Oueue is Empty!");
            }
            else{
             int val=arr[front];
             if(front==arr.length-1) front=0;
             else front++;
             size--;
             return val;
            }
         }
         
         // Peek
         public int peek() throws Exception{
            if(size==0){
                  throw new Exception("Queue is empty!");
            }else{
                  return arr[front];
            }
         }

         //isEmpty
         public boolean isEmpty(){
            return size==0;
         }

         //Display
         public void display(){
            if(size==0){
                  System.out.print("Queue is Empty!");
            }else if(front<=rear){
               for(int i=front;i<=rear;i++){
                  System.out.print(arr[i]+" ");
               }
            }else{//rear =>front
               for(int i=front;i<arr.length;i++){
                  System.out.print(arr[i]+" ");
               }
               for (int i = 0; i<=rear; i++) {
                System.out.print(arr[i]+" ");   
               }
            }
            System.out.println();
         }
      }
      public static void main(String[] args) throws Exception{
          Cqa q=new Cqa();
          q.display();
          q.add(1);
          q.add(2);
          q.add(3);
          q.add(4);
          q.display();
          q.remove();
          q.display();
          q.add(5);
          q.display();
          q.add(6);
          q.display();// 6 2 3 4 5 -> 2 3 4 5 6
          System.out.println(q.isEmpty());
          //Array display
      //     for(int i=0;i<q.arr.length;i++){
      //       System.out.print(q.arr[i]+" ");
      //     }
      }    
}