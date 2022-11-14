import java.util.*;

public class Main {
    private static float median(int[] arr, int n){
        if(n%2==0){
            float a=(float)arr[((n/2)-1)];
            float b=(float)arr[(n/2)];
            return (a+b)/2;
        }else{
            float a=(float)arr[(n/2)];
            return a;
        }
    }
    public static void main(String[] arts)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();

        int s[] = new int[d];
        for(int i=0;i<d;i++){
            s[i]=sc.nextInt();
        }
        Arrays.sort(s);
        int notice=0;
        for(int i=d;i<n;i++){
            int temp=sc.nextInt();

            if(temp>=2*(median(s,d))){
                notice++;
            }

            for(int j=0;j<d-1;j++){
                s[j]=s[j+1];
                if(temp>s[j]){
                    s[j+1]=temp;
                    break;
                }
            }

        }
        System.out.println(notice);


    }
}