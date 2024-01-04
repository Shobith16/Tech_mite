import java.util.Scanner;

public class printingthelowercase {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String(ex:AbCd):");
        String str = sc.next();

        char[] Str_arr = str.toCharArray();

        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (Str_arr[i] > 'a' && Str_arr[i] <= 'z') {
                sb.append(Str_arr[i]);

            }
        }

        System.out.println("The resultant String is:" + sb.toString());

    }

}
