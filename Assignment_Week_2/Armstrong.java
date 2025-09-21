public class Armstrong {
    public static void main(String[] args) {
        int n = 153;  
        int original = n;
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        int sum = 0;
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            
            sum += power;
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else 
        {
        
         System.out.println(original + " is NOT an Armstrong number.");
        
        }
    }
}
