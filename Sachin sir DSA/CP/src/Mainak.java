import java.util.*;
class Mainak{
    public static int max(int a, int b){
        return(a>b)?(a):(b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int tt=1;tt<=t;tt++){

            int n=sc.nextInt();
            int[] arr=new int[n];
            if(n==1|| n==0){
                sc.nextInt();
                System.out.println(0);
                continue;
            }
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

                if(i!=0){
                    if(arr[i]>max)max=arr[i];
                }
                if(i!=n-1){
                    if(arr[i]<min)min=arr[i];
                }
            }
            int res=max(max-arr[0],arr[n-1]-min);
            for(int i=0;i<n-1;i++){
                res=max(res,arr[i]-arr[i+1]);
            }

            System.out.println(res);
        }
    }
}