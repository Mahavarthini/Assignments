public class Postiv{
    public static void main(String []args){
        int [] arr={ 5,-3,0,12,-9,0,7};
        int positive=0,negative=0,zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else
            {
                zero++;
            }
        }
        System.out.println("Positive numbers"+positive);
        System.out.println("Negative numbers"+negative);
        System.out.println("Zero"+zero);
    }
}
    