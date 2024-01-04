import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        System.out.println("Enter the digit to be tested:");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
         if(num<=3){
            System.out.println("RES:"+((num==2 || num==3)?"Prime":"Neighter prime nor composite"));
         }
         else if(num%2==0 || num%3==0){
            System.out.println("not prime");            
         }else{
            System.out.println("Prime");
         }
    }
    
}
