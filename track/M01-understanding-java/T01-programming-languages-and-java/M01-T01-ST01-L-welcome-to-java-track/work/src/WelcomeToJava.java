//import java.util.Scanner;
import java.util.*;
 class Student{
        String name;
        int age;
        int id;

    }
public class WelcomeToJava {
    public static void main(String[] args) {
          
    Scanner sc = new Scanner(System.in);
    Student s = new Student();
    Student s1 = new Student();
    System.out.println("Ente");
    s.id = sc.nextInt();
    s.name =  sc.next();
    s.age = sc.nextInt();

     s1.id = sc.nextInt();
    s1.name =  sc.next();
    s1.age = sc.nextInt();

    System.out.println("Student 1 Details");
    System.out.println("Name: "+s.name);
    System.out.println("Age: "+s.age);
    System.out.println("ID: "+s.id);

    System.out.println("Student 2 Details");
    System.out.println("Name: "+s1.name);
    System.out.println("Age: "+s1.age);
    System.out.println("ID: "+s1.id);
       sc.close(); 
    }
}
