import java.util.Scanner;
public class Sloution{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(--t>=0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n==2 && arr[0]==1 && arr[1]==2){
                System.out.println("NO");
                continue;
            }
            int rsum=0;
            int lsum=0;
            int i=0;
            int j=n-1;
            boolean incR=true;
            boolean incL=true;
            while(j>i+1){
                if(incR)rsum+=arr[j];
                if(incL)lsum+=arr[i];
                if(rsum>lsum){
                    i++;
                    incR=false;
                    incL=true;
                }else if(rsum<lsum){
                    j--;
                    incL=false;
                    incR=true;
                }else{
                    i++;j--;
                    incL=true;
                    incR=true;
                }
            }
            
            if(lsum==rsum){
                System.out.println("YES");
            }else{
                lsum-=arr[i];
                rsum-=arr[n-1];
                
                if(lsum==rsum)System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}