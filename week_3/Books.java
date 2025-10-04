import java.util.*;
public class Books{
    String title;
    String author;
    double price;
    Books(){
        String title="";
        String author="";
        double price;
    }
    Books(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayBookDetails(){
        System.out.println("Book Name:"+title);
        System.out.println("Author Name:" +author);
        System.out.println("Price:" +price);
    }

    public static void main(String []args){
        Books b=new Books();
        System.out.println("Default constructor");
        b.displayBookDetails();
        Books b1=new Books("Java programming","John",567.6);
        System.out.println("Paramaterized constructor");
        b1.displayBookDetails();
    }
}