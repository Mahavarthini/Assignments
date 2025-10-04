import java.util.*;
public class Main{
    double len;
    double  breadth;

    void  area(){
        double AreaofRec=len*breadth;
        System.out.println("Area of Rectangle=" +AreaofRec);
    }
    void Perimeter(){
        double peri=2*(len+breadth);
        System.out.println("Perimeter of Rectangle=" +peri);
    }
    
    public static void main(String args[]){
        Main r1=new Main();
        r1.len=50;
        r1.breadth=25;
        r1.area();
        r1.Perimeter();
    }        
}