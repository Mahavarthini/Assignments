public class TheBiggestTreasure
{
    public static void main(String args[])
    {
        int a=10,b=22,c=18;
        if(a>b && a>c)
        {
            System.out.println("a is larger\t"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("b is larger\t"+b);
        }
        else{
            System.out.println("c is larger\t"+c);
        }
    }
}