import java.util.*;

class subarr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] storeval = new int[6];
        int[]  res=new int[4];
        int k,count=0;
        for(int i=0; i<=storeval.length-1; i++){
            storeval[i]=sc.nextInt();
        }
        System.out.println("Enter subarr count:");
        k=sc.nextInt();
        for(int i=0; i<storeval.length-(k-1); i++){
            if(storeval[i]>storeval[i+1]){
                if(storeval[i]>storeval[i+2]){
                    
                    res[count]=storeval[i];
                    count++;
                }else{
                    
                    res[count]=storeval[i+2];
                    count++;
                }
            }else{
                if(storeval[i+1]>storeval[i+2]){
                    
                    res[count]=storeval[i+1];
                    count++;
                }else{
                    
                    res[count]=storeval[i+2];
                    count++;
                }
            }

        }
        for(int i=0; i<=res.length-1; i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}