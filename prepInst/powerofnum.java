
import java.util.*;

public class powerofnum {
    static int res(int base,int pow){
        if(pow==0){
            return 1;
        }
        return (base * res(base, pow-1));
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base val:");
        int base = scanner.nextInt();
        System.out.println("Enter the pow :");
        int pow = scanner.nextInt();

        int res = res(base, pow);

        System.out.println("The result is: "+res);
    }
    
}
