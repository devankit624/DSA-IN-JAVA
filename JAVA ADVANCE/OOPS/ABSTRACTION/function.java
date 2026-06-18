abstract class bird{

    abstract void fly();
    abstract void eat();


}

class sparrow extends bird{

    @Override
    void fly(){
        System.out.println("birds fly");
    }
    @Override
    void eat(){
        System.out.println("Birds eat");
    }

}


public class function{
    public static void main(String[] args){
        bird b  = new sparrow();
        b.eat();
        b.fly();
        
    }
}