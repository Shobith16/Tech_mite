// 1.write a program to cal sum of even numbers in a array (atleast 10)

import java.util.*;

public class prgm1{
    public static void main(String[] args) {
        int no_of_ele,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array: ");
        no_of_ele=sc.nextInt();
        int array[] = new int[no_of_ele];

        for(int i=0; i<no_of_ele; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("array ele are:");
        for(int i=0; i<no_of_ele; i++){
            System.out.println(" "+array[i]); 
            if(array[i]%2==0){
                sum+=array[i];
            }
        }
        System.err.println("Sum of Even numbers in a array are :"+sum);
        
    }
}