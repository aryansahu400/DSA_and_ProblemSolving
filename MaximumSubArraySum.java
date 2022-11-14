import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int n=sc.nextInt();
            long m=sc.nextLong();
            long[] arr=new long[n];

            long maxSum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong()%m;
            }
            for(int i=0;i<n-1;i++){
                long sum=arr[i]%m;
                for(int j=i+1;j<n;j++){
                    sum+=arr[j]%m;
                    if(maxSum<sum){
                        maxSum=sum;
                    }
                }
            }
            System.out.println(maxSum%m);

        }
    }
}
