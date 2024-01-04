import java.util.Scanner;

public class AlphabetorNot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the char to be Known:");
            char isDig=scanner.next().charAt(0);

            // if(Character.isDigit(isDig)){
            //     System.out.println("It is a digit");
            // }else{
            //     System.out.println("It is not a digit");
            // }

            if(('a'<=isDig && isDig<='z')|| (isDig <= 'A' && isDig <= 'Z')){
                System.out.println("It is a Alphabet "+isDig);
            }else{
                System.out.println("It is not a Alphabet "+isDig);
            }

        }
}
