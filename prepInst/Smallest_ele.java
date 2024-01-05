
import java.util.*;

public class Smallest_ele {
    

    
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the 10 elements to array:");
        Scanner sc=new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest Element in the array is :"+arr[0]);
    }


}
