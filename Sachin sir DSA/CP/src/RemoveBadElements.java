import java.util.HashMap;
import java.util.Scanner;

public class RemoveBadElements {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int n=sc.nextInt();
            HashMap<Integer, Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(hm.containsKey(temp)){
                    hm.put(temp, hm.get(temp)+1);
                }else{
                    hm.put(temp,1);
                }
            }
            int sum=0;
            int max=0;
            for(int i:hm.values()){
                sum+=i;
                if(i>max){
                    max=i;
                }
            }
            if(max==sum){
                System.out.println(0);
            }else{
                System.out.println(sum-max);
            }
        }
    }
}
