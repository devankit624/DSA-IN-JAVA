public class Main{
    static class Node{
        int data;
        Node previous;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    // data members
    private Node head;
    private Node tail;
    private int size;


    Main(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void inserthead(int data){
        Node newNode = new Node(data);
        if(head == null &&  tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.previous = newNode;
            //head update
            head = newNode;
        }
        // ek nide add hui hai linked hai linked list mei
        size++;
    }

    // insert at tail
    public void inserttail(int data){
        Node newNode = new Node(data);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.previous = tail;
            tail.next = newNode;
            //tail update
            tail = newNode;
        }
        // ek node add hui hai size ko update karo
        size++;
    }
    // Insert at the any position
    public void insertposition(int position, int data){
        if(position < 1 || position > size + 1){
            System.out.println("Invalid position");
        }
        if(position == 1){
            inserthead(data);
            return;
        }
        if(position == size + 1){
            inserttail(data);
            return;
        }
        //insert at the position
        Node temp = head;
        for (int i = 0; i < position - 2; i++){
            temp= temp.next; 
        }
        //ab mera previous node a  chuka hai
        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);

        // links setup karna hai ab
        currNode.previous = prevNode;
        prevNode.next = currNode;
        currNode.next = nextNode;
        nextNode.previous = currNode;
        // ek node add hui hai to size increase karo
        size++;
    }
    public void printll(){
        if(head == null){
            System.out.println("Nothing to delete");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // how can print backward Linked list
    public void printbackward(){
        Node temp = tail;
        while(temp != null){
            System.err.print("<-" + temp.data);
            temp = temp.previous;
        }
    }
    //search in the doubly ll
        public boolean search(int target){
            if(head == null){
                System.out.println("Not found");
                return false;
            }
            Node temp = head;
            while (temp != null) {
                if(temp.data == target){
                    return true;
                }
                
            
            else{
                temp = temp.next;
            }
        }
            return false;
        }

        // delete in doubly
        public void deletehead(){
            if(head == null){
                System.out.println("No Node Present");
            }
            // main logic
            // if single node Present
            if(head == null){
                head = null;
                tail = null;
                return;
            }
            // more than 1 node Present
            head = head.next;
            head.previous = null;
            size--;
            

        }
        public void deletetail(){
            if(head == null){
                System.out.println("One node Present");
            }
                // for sigle node
                if(head == tail){
                head = null;
                tail = null;
                size = 0;
                return;
            }
                // ll has more tan one node
                Node currNode = tail;
                Node prevNode = tail.previous;

                //Link change
            prevNode.next = null;
            currNode.previous = null;
            // 
            tail = prevNode;
            // update size 
            size--;
            }

        public void deleteposition(int position){
            if(head == null){
                System.out.println("One node Present");
                return;
            }
            if(position == 1){
                deletehead();
                return;
            }
            if(position == size + 1){
                deletetail();
                return;
            }
            // koi inbetween node ko delete krna hai 
            //reach to that postition
            Node currNode = head;
            for (int i = 1 ; i <= position - 1; i++){
                currNode = currNode.next;
            }
             // current node at the right position
             Node prevNode = currNode.previous;
             Node nextNode = currNode.next;
             //links to change krna hai
             prevNode.next = nextNode;
             nextNode.previous = prevNode;
             currNode.previous = null;
             currNode.next = null;
             size--;
        }
    public static void main(String[] args){
        Main mylist = new Main();
        mylist.inserthead(40);
        mylist.inserthead(30);
         mylist.inserthead(20);
        mylist.inserthead(10);
        // Insert at the tail position
        mylist.inserttail(150);
        // insert at the specific postion
        mylist.insertposition(3, 200);
        mylist.printll();
        // backward list printing
        System.err.println();
        mylist.printbackward();

                System.err.println();


        System.out.println("found or not" + mylist.search(150));

        mylist.deletehead();
        mylist.printll();

        mylist.deletehead();
        mylist.printll();

        mylist.deletehead();
        mylist.printll();

        mylist.deletetail();
        mylist.printll();

        mylist.deletetail();
        mylist.printll();


        mylist.inserthead(70);
        mylist.inserthead(80);
         mylist.inserthead(90);
        mylist.inserthead(100);

        mylist.deleteposition(3);
        mylist.printll();
    }
}