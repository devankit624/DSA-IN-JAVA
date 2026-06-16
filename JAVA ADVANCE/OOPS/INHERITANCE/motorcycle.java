public class motorcycle extends vechile{
    public String handlebarstyle;
    public String suspensiontype;

    // motorcycle constructor
    public motorcycle(String name, String model , int not,  String handlebarstyle, String suspensiontype){
        super(name, model, not);
        this.handlebarstyle = handlebarstyle;
        this.suspensiontype = suspensiontype;

    }


    public void wheelie(){
        System.out.println("Motorcycle wheelie " + name);
    }
}