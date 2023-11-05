// input :{name1,name2,name3,nam4}
// output :{1eman,NAME2,3eman,NAME4}
import java.util.*;
public class prgm3 {
    public static void main(String[] args) {
        int no;
        String str;
        
        System.out.println("Enter the total names to be entered :");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();

        String[] arr=new String[no];
        String[] arr2=new String[no];
        System.out.println("Enter the Names ");
        for(int i=0; i<no; i++) {
            arr[i]=sc.next();
        }

        for(int i=0; i<no; i++) {
            // System.out.println("Array elements are:"+arr[i]);
            if(i%2==0){
                //reverse
                StringBuilder sb = new StringBuilder();
                for(int j=arr[i].length()-1;j>=0;j--){
                    String temp=arr[i];
                    sb.append(temp.charAt(j));

                }
                arr2[i]=sb.toString();

            }else{
                //uppercase
                arr2[i]=arr[i].toUpperCase();
            }
        }
         for(int i=0; i<no; i++) {
            System.out.print(" "+arr2[i]);
         }
    }
    
}
