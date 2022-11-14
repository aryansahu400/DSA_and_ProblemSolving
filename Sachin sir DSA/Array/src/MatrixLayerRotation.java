import java.util.ArrayList;
import java.util.Scanner;

public class MatrixLayerRotation {
    public static int min(int a, int b){
        return (a>b)?(a):(b);
    }

    public static void rotate(int[][] arr,int r) {

        int n = arr.length;
        int m= arr[0].length;
        // r=r%min(n,m);
        int x=0;
        int y=0;
        int min=min(n,m);

        while ( x < n / 2 && y< m/2) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = y; i < m-y; i++) {
                al.add(arr[x][i]);
            }
            for (int i = x+1; i < n-x; i++) {
                al.add(arr[i][m - 1-y]);
            }
            for (int i = m-y - 2; i >= y; i--) {
                al.add(arr[n -x- 1][i]);
            }
            for (int i = n -x- 2; i >=x; i--) {
                al.add(arr[i][y]);
            }
//            ans.add(al);


            int index=r%(al.size()-1);

            for (int i = y; i < m-y; i++) {
                arr[x][i]=al.get(index);
                index++;
                if(index==al.size()-1){
                    index=0;
                }

            }
            for (int i = x+1; i < n-x; i++) {

                arr[i][m-y-1]= al.get(index);
                index++;
                if(index==al.size()-1){
                    index=0;
                }
            }
            for (int i = m-y - 2; i >= y; i--) {
                arr[n -x- 1][i]= al.get(index);
                index++;
                if(index==al.size()-1){
                    index=0;
                }
            }
            for (int i = n -x- 2; i >=x; i--) {
                arr[i][y]= al.get(index);
                index++;
                if(index==al.size()-1){
                    index=0;
                }
            }
            x++;
            y++;
        }
//        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int r=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)arr[i][j]=sc.nextInt();
        }
        rotate(arr,r);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
