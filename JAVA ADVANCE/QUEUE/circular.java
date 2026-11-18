public class circular{


  class circularqueue{
    int front;
    int rear;
    int capacity;
    int[] arr;
    int size;


    circularqueue(int n){
      this.front = 0;
      this.rear = -1;
      arr = new int[n];
      capacity = n;
    }

    public boolean enque(int n){
      if(isempty()){
        return false;
      }
      else{
        rear = (rear + 1) % capacity;
        arr[rear] = n;
        size++;
      }
    }

    public int deque(){
      if(isempty()){
        return -1;
      }
      int removed = arr[front];
      arr[front] = -1;
      front = (front + 1) % capacity;
      size--;
      return removed;
    }

    public int getfront(){
      if(isempty()){
        return -1;
      }
      else{
        return arr[front];
      }
    }

    public int getrear(){
      if(isempty()){
        return -1;
      }
      else{
        return arr[rear];
      }
    }

    public int getsize(){
      return this.size;
    }

    public boolean full(){
      if(size == capacity){
        return true;
      }
      else{
        return false;
      }
    }



    public boolean isempty(){
      if(size == 0){
        return true;
      }
      else{
        return false;
      }
    }
  }



  public static void main(String[] args){

    circularqueue q = new circularqueue(5);
      System.out.println(q.enque(10));
      System.out.println(q.enque(20));
      System.out.println(q.enque(30));
      System.out.println(q.enque(40));

      System.out.println(q.getfront());


  }
}