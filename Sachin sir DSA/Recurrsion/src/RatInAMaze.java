import java.util.ArrayList;
import java.util.Scanner;


public class RatInAMaze {
    public static boolean isLegal(int[][] m,int x, int y){
        if((x< m.length && y<m[0].length) && (x>=0 && y>=0)){
            return true;
        }else{
            return false;
        }
    }
    public static void path(ArrayList<String> ans, StringBuilder curr,int[][] maze, boolean[][] visited, int x,int y, int n, int m){
        if(x==n-1&& y==m-1){
            ans.add(curr.toString());
        }
        visited[x][y]=true;
        //down
        if(isLegal(maze,x+1,y)&& maze[x+1][y]==1 && visited[x+1][y]==false){
            curr.append('D');
            path(ans,curr,maze,visited,x+1,y,n,m);
            curr.deleteCharAt(curr.length()-1);
        }
        //up
        if(isLegal(maze,x-1,y)&& maze[x-1][y]==1 && visited[x-1][y]==false){
            curr.append('U');
            path(ans,curr,maze,visited,x-1,y,n,m);
            curr.deleteCharAt(curr.length()-1);
        }
        //right
        if(isLegal(maze,x,y+1)&& maze[x][y+1]==1 && visited[x][y+1]==false){
            curr.append('R');
            path(ans,curr,maze,visited,x,y+1,n,m);
            curr.deleteCharAt(curr.length()-1);
        }
        //left
        if(isLegal(maze,x,y-1)&& maze[x][y-1]==1 && visited[x][y-1]==false){
            curr.append('L');
            path(ans,curr,maze,visited,x,y-1,n,m);
            curr.deleteCharAt(curr.length()-1);
        }
        visited[x][y]=false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        int[][] maze=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j]= sc.nextInt();
            }
        }
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder curr=new StringBuilder("");
        boolean[][] visited=new boolean[n][m];
        path(ans,curr,maze, visited,0,0,n,m);
        System.out.println(ans);
    }
}
