import java.util.*;

public class lcm {
    static int hcf(int n1 ,int n2) {

        if(n1==0){
            return n2;
        }else if(n2==0){
            return n1;
        }else if(n1==n2){
            return n1;
        }else if(n1>n2){
            return hcf(n1-n2,n2);

        }
        return hcf(n1,n2-n1);

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=hcf(n1,n2);
        int lcm=n1*n2/hcf;                //  A×B=LCM(A,B)×HCF(A,B)

        System.out.println("Result is of hcf : "+hcf+" & lcm :"+lcm);
    }
    
}
