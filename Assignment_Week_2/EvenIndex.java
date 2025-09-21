public class EvenIndex
{
    public static void main(String args[]){
        int []arr={10,20,30,40,50,60,70};
        System.out.println("Elements in even index");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println("Index\t "+ i +" "+ arr[i]);
            }
       }
    }
}