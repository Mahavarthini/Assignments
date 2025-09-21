
import java.util.Arrays;
public class Simple {
    public static void main(String[] args){
        int arr[] = {5, -3, 0, 12, -9, 0, 7};
        Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];
        System.out.println("Second largest element: " + secondLargest);
    }
}