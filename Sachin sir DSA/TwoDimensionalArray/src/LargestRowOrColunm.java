import java.util.Scanner;

public class LargestRowOrColunm {
    public static void max(int[][] arr){
        int indexi=0;
        int maxi=Integer.MIN_VALUE;
        int indexj=0;
        int maxj=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sumi=0;
            int sumj=0;
            for(int j=0;j<arr[0].length;j++){
                sumi+=arr[i][j];
                sumj+=arr[j][i];
            }
            if(sumi>maxi){
                maxi=sumi;
                indexi=i;
            }
            if(sumj>maxj){
                maxj=sumj;
                indexj=i;
            }
        }
        if(maxi>maxj){
            System.out.println(indexi+" "+maxi);
        }else{
            System.out.println(indexj+" "+maxj);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        max(arr);
    }
}
