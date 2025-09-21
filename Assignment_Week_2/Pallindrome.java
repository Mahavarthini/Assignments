public class Pallindrome
{
    public static void main(String args[]){
        int n=1221;
        int or=n;
        int rv=0;
        while(n>0){
            int d=n%10;
            rv=rv*10+d;
            n=n/10;
        }
        if(or==rv)
        {
            System.out.println(or + "\tis a pallindrome");

        }
        else{
            System.out.println(or+"\t is not a Pallindrome");
        }
    }
}