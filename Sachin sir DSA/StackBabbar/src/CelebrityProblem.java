import java.util.Scanner;

public class CelebrityProblem {
    public static int findCeleb(int[][] arr){
        int n= arr.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            s.push(i);
        }
        while(s.getSize()!=1){
            int a=s.pop();
            int b=s.pop();
            if(arr[a][b]==1){
                s.push(b);
            }
            if(arr[b][a]==1){
                s.push(a);
            }
        }
        int index=s.peek();
        for(int i=0;i<n;i++){
            if(i==index)continue;
            if(arr[i][index]!=1){
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(findCeleb(arr));
    }
}
