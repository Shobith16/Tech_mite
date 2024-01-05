import java.util.*;

public class reverse {

    public static void main(String[] args) {
        int rev=0,rem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to be reversed:");
        int num=scanner.nextInt();

        while(num!=0){

            rem=num%10;
            num=num/10;
            rev=rev*10+rem;


        }
        System.out.println("The Reversed Value is :"+rev);


    }
}
