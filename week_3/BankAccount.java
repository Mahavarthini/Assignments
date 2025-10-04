public class BankAccount{
    int accNum;
    double balance;
    BankAccount(){
        int accNum=27689;
        double balance;
    }
    BankAccount(int accNum,double balance) {
        this.accNum=accNum;
        this.balance=balance;
    }
    void deposit(double amount) {
        if (amount>0){
            balance+=amount;
          System.out.println("Deposited"+amount);
         System.out.println("Available balance="+balance);
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("withdraw amount"+amount);
            System.out.println("Available balance="+balance);

        }
    }
   public static void main(String args[]){
        BankAccount bnk=new BankAccount();
        System.out.println( "Account NO:" +bnk.accNum);
        System.out.println("Balance:"+bnk.balance);
        bnk.deposit(500);
        bnk.withdraw(200);
        
       BankAccount bnk2=new BankAccount(23416,25000.0);
         System.out.println( "Account NO:" +bnk2.accNum);
        System.out.println("Balance:"+bnk2.balance);
        bnk2.deposit(1000);
        bnk2.withdraw(500);
   }
    }