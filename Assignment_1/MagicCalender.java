public class MagicCalender
{
    public static void main(String args[])
    {
        int year=2025;
        if(year%4==0)
        {  
            System.out.print(+year);
            System.out.println("\t:Leap year");
        }
        else
        {  
            System.out.print(+year);
            System.out.println("\t:is Not a Leap year");
        }
    }
}