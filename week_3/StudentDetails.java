import java.util.*;
class Student{
    String name;
    int rollNo;
    int marks;

    void display(){
        System.out.println("--STUDENT DETAIL--");
        System.out.println("Name:" +name);
        System.out.println("Roll No.:" +rollNo);
        System.out.println("marks:" +marks);
    }
}
public class StudentDetails{
    public static void main(String args[]){
        Student s=new Student();
        Student s1=new Student();
        Student s2=new Student();
        s.name="John";
        s.rollNo=234;
        s.marks=490;
        s1.name="Sam";
        s1.rollNo=213;
        s1.marks=496;
        s2.name="Priya";
        s2.rollNo=224;
        s2.marks=494;
        s.display();
        s1.display();
        s2.display();
        
    }
}