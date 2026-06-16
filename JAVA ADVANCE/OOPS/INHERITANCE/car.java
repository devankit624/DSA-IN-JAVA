public class car extends vechile{

    public int nod ;
    public String transtype ;


    public car(String name, String model , int not, int nod, String transtype){
        super(name, model, not);
        this.nod = nod;
        this.transtype = transtype;
    }


    public void startac(){
        System.out.println("Ac starts" + name);

    }
    
        
    

}