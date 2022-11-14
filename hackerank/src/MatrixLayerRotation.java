import java.util.Scanner;

public class MatrixLayerRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int i=0;
        int j=0;
        int temp=arr[n-1][j];
        while(i<n-1){
            arr[i+1][j]=arr[i][j];
            i++;
        }
        int temp2=arr[i][m-1];
        j++;
        while(j<m-1){
            arr[i][j+1]=arr[j][i];
            j++;
        }
        arr[i][1]=temp;
        temp=arr[0][j];
        i--;
        while(i>0){
            arr[i-1][j]=arr[i][j];
            i--;
        }
        arr[n-2][j]=temp2;
        j--;
        while(j>0){
            arr[i][j-1]=arr[i][j];
            j--;
        }
        arr[0][0]=temp;

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
