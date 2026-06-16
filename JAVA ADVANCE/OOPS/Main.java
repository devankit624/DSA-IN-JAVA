public class Main {
    public static void main(String[] args) {

        // A.id = 5; m
        // A.age = 141;
        // A.name = "Raghav";

        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.name);
        // A.study();
        // A.sleep();


        Student A = new Student(101, 15, "Rahul", 6 , "tina");
        System.out.println(A.getName());


        System.out.println(A.getAge());


        A.setAge(65);
        System.out.println(A.getAge());
        // System.out.println(A.age);
        // System.out.println(A.name);3
        // System.out.println(A.gf);
        A.study();
        A.sleep();

        // Student B = new Student(A);
        // System.out.println(B.id);
        // System.out.println(B.age);
        // System.out.println(B.name);
        A.study();
        A.sleep();


    }
}



