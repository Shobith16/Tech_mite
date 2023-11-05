// for a given array of integers return the indies of two numbers such that they add up to 
// specific target. u may assume that each input have exactly one sol and u may not use same element twice
import java.util.*;

public class prgm2 {
    public static int[] ind(int[] arr){
        int target = 5,count=0;
        int array2[] = new int[6];
        for(int i=0; i<arr.length; i++){
          for(int j=i+1; j<arr.length; j++){
            if(arr[i]+arr[j]==target){
             array2[count++]=i;
             array2[count++]=j;
             
           }
          }
           
        }
        return array2;
    }
    public static void main(String[] args){
        int no_of_ele,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array: ");
        no_of_ele=sc.nextInt();
        int array[] = new int[no_of_ele];
        // int array2[] = new int[12];

        for(int i=0; i<no_of_ele; i++){
            array[i] = sc.nextInt();
        }
        int[] array2=ind(array);

        for(int i=0; i<array2.length; i++){
            if(array2[i]==0&&c==0){
                System.out.println(" "+array2[i]);
                c++; 
            }else if(c==1&&array2[i]!=0){
                System.out.println(" "+array2[i]);
            }
                
        }
    }
}
