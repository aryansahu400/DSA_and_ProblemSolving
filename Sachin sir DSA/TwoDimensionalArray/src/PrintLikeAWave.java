import java.util.ArrayList;
import java.util.Scanner;

public class PrintLikeAWave {
    public static ArrayList<Integer> prepareOutput(int[][] a){
        ArrayList<Integer> ans=new ArrayList<>();
        //i is col
        for(int i=0;i<a[0].length;i++){
            if(i%2==0){
                for(int j=0;j<a.length;j++){
                    ans.add(a[j][i]);
                }
            }else{
                for (int j = a.length-1; j >=0; j--) {
                    ans.add(a[j][i]);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(prepareOutput(arr));
    }
}
