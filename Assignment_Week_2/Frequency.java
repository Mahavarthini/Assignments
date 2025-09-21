public class Frequency
{
    public static void main(String args[]){
        int []arr={2,4,2,6,2,9,6};
        int num=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(num + " "+"appeared"+ " " +count   + "times" );
    }
}