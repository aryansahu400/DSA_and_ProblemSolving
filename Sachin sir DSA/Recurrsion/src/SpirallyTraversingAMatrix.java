import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SpirallyTraversingAMatrix {

    public static boolean isLegal(int[][]arr, int x, int y){
        if((x>=0 && y>=0) &&(x<arr.length && y<arr[0].length))return true;
        else return false;
    }
    public static boolean upPossible(int x, int y, int[][]arr, boolean[][] visited){
        if(isLegal(arr,x-1,y)){
            if(visited[x-1][y]==false){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean leftPossible(int x, int y, int[][]arr, boolean[][] visited){
        if(isLegal(arr,x,y-1)){
            if(visited[x][y-1]==false){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean downPossible(int x, int y, int[][]arr, boolean[][] visited){
        if(isLegal(arr,x+1,y)){
            if(visited[x+1][y]==false){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean rightPossible(int x, int y, int[][]arr, boolean[][] visited){
        if(isLegal(arr,x,y+1)){
            if(visited[x][y+1]==false){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Queue<Integer> ans=new LinkedList<>() ;
        boolean[][] visited=new boolean[n][m];

        int limit=n*m;
        int x=0,y=0;
        ans.add(arr[0][0]);
        while(limit>0){
            while(rightPossible(x,y,arr,visited)){
                visited[x][y]=true;
                ++y;
                ans.add(arr[x][y]);

                --limit;
            }
            while(downPossible(x,y,arr,visited)){
                visited[x][y]=true;
                ++x;
                ans.add(arr[x][y]);

                --limit;
            }
            while(leftPossible(x,y,arr,visited)){
                visited[x][y]=true;
                --y;
                ans.add(arr[x][y]);

                --limit;
            }
            while(upPossible(x,y,arr,visited)){
                visited[x][y]=true;
                --x;
                ans.add(arr[x][y]);

                --limit;
            }
            if(limit==1)break;
        }
        System.out.println(ans);
    }
}
