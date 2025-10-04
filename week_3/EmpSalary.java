import java.util.*;
public class EmpSalary{
    private String name;
    private int id;
    private double salary;
    //Getter 
    String getName(){
        return name;
    }
    //Setter
    void setName(String newName){
        this.name=newName;
    }

    int getId(){
         return id;
    }
    void setId(int newId){
        this.id=newId;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double newSal){
        this.salary=newSal;
    }

    EmpSalary(String name,int id,double salary){
        this.id=id;
        this.salary=salary;
    }
    public static void main(String []args){
        EmpSalary e1=new EmpSalary("John",32414,50000);
        //setter 
        e1.setName("Priya");
        e1.setId(1352);
        e1.setSalary(65000);
       System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());
        
    }
}