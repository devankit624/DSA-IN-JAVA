public class Stu2{
    public int id;
    public int age;
    public int classes;
    public String name;
    
    
    // Constructor
    public Stu2(int id, int age,  int classes, String name){
        this.id = id;
        this.age = age;
        this.classes = classes;
        this.name = name;
    }
    
    
    // function of the Student
    public void study(){
        System.out.println(name + " study");
    }
    
    
    // sleep function for the Student
    public void sleep(){
        System.out.println(name + " sleep");
    }
}