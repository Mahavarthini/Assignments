public class BankBalance
{
    public static void main(String args[])
    {
        int balance=0;
        if(balance>0)
        {
            System.out.println("Positive");

        }
        else if(balance==0)
        {
            System.out.println("Overdraft");
        }
        else
        {
          System.out.println("Negative");
        }
    }
}