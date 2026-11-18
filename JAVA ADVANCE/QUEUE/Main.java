import java.util.*;


class Queue{
  int[] arr;
  int size;
  int front;
  int rear;
  int capacity;


public Queue(int n){
  arr = new int[n];
  this.capacity = n;
  size = 0;
  front = 0;
  rear = -1;
}


public boolean enque(int value){
  if(isfull()){
    return false;
  }
  else{
    rear++;
    arr[rear] = value;
    size++;
    return true;
  }
}

public int remove(){
  if(checkempty()){
    return -1;
  }

  else{
    int remove = arr[front];
    arr[front] = -1;
    front++;
    size--;

    return remove;
  }
}


public int getfront(){
  if(checkempty()){
    return -1;
  }
  else{
    return arr[front];
  }
}

public int getrear(){
  if(checkempty()){
    return -1;
  }
  else{
    return arr[rear];
  }
}


public int size(){
  return this.size;
}

public boolean isfull(){
  if(rear == capacity - 1){
    return true;
  }
  else{
    return false;
  }
}

public boolean checkempty(){
  if(size == 0){
    return true;
  }
  else{
    return false;
  }
}

}



public class Main {
    public static void main(String[] args) {
      Queue q = new Queue(5);
      System.out.println(q.enque(10));
      System.out.println(q.enque(20));
      System.out.println(q.enque(30));
      System.out.println(q.enque(40));

      System.out.println(q.getfront());


    }
}