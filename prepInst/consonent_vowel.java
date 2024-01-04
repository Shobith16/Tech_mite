import java.util.*;
import java.lang.String;
public class consonent_vowel {
    public static boolean vowelorconso(char ch){
        String str = "aeiou";
       
        
        char checkChar = Character.toLowerCase(ch);
        return str.contains(Character.toString(checkChar));
            
    }
    public static void main(String[] args) {
        boolean res;
        Scanner sc=new Scanner(System.in);
        char ch;

        System.out.println("Enter the alphabet:");
        ch=sc.next().charAt(0);

        res=vowelorconso(ch);

        if(res){
            System.out.println("Entered Char is vowel");
        }else{
            System.out.println("Entered Char is Consonent");

        }

    }
    
}
