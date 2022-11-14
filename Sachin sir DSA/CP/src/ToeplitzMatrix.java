import java.util.Scanner;

public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<m-1;i++){
            int a=arr[0][i];
            int col=i;;
            for(int j=0;j<n;j++){
                if(col>=m)break;
                if(arr[j][col]!=a)return false;
                col++;
            }
        }
        for(int i=0;i<n-1;i++){
            int a=arr[i][0];
            int col=0;
            int row=i;
            while(row<n && col<m){
                if(arr[row][col]!=a)return false;
                row++;
                col++;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(isToeplitzMatrix(arr));
    }
}
