//String is the sequence of the character
// String str= "Hola"
// class  object  String Literal
//String Methods
import java.util.Scanner;
public class str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String firstName = "Hola!";
        String lastname = new String("Kya haal chal");
         System.out.println(firstName + lastname);
         // Length of the String
         System.out.println(firstName.length());
         System.out.println(firstName.charAt(0));
     if (firstName.equalsIgnoreCase(lastname)){
         System.out.print("Both equal");
     }
     String str = sc.next();
     System.out.println("By next" + str);
     String str2 = sc.nextLine();
     System.out.println("By next line" + str2);
    String str = " JAVA ";
     System.out.println(str.isEmpty());
     System.out.println(str.isBlank());
     System.out.println(str.length());
     //trim command
    str =  str.trim();
     System.out.println(str.length());
     //String upper case
     System.out.print(str.toUpperCase());
     // String to upper case
     System.out.println(str.toLowerCase());
 System.out.println(str.substring(2,5));
 System.out.println(str.contains("JAVA"));
 System.out.print(str.startsWith("J"));
String to charachter Array
String str2 = "JAVA";
 char chy[] = str2.toCharArray();
 for(char ch: chy){
     System.out.println(ch);
 }

str2 = str2.replace('J', 'A');
System.out.print(str2);
sc.close();
    }
}