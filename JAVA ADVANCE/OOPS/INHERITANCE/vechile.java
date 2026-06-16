// Intertance 
// Inheritancve it is a herirical Relationship
public class vechile{
    public String name;
    public String model;
    public int not;


    public vechile(){
        this.name = "";
        this.model = model;
        this.not = not;
    }

    public vechile(String name, String model, int not){
        // custom constructor
        this.name = name;
        this.model = model;
        this.not = not;
    }


    public void startengine(){
        System.out.println(name + " Engine Starts");
    }

    public void stopengine(){
        System.out.println(name + " Engine Stops of " + model);
    }
}