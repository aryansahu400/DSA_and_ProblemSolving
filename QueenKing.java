import java.util.Scanner;

public class QueenKing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();;
        while(--t>=0) {
            int n = 8;
            int[][] arr = new int[n][n];
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;
            b--;
            arr[a][b] = 1;
            //corner == 1
            if (a == 0 && b == 0) {
                arr[1][2] = 2;
            } else if (a == 0 && b == 7) {
                arr[1][5] = 2;
            } else if (a == 7 && b == 0) {
                arr[6][2] = 2;
            } else if (a == 7 && b == 7) {
                arr[6][5] = 2;
            } else if (a == 0 && b == 1) {
                arr[1][3] = 2;
                arr[2][0] = 2;
            } else if (a == 0 && b == 2) {
                arr[1][4] = 2;
                arr[2][1] = 2;
            } else if (a == 0 && b == 3) {
                arr[1][5] = 2;
                arr[2][2] = 2;
            } else if (a == 0 && b == 4) {
                arr[1][6] = 2;
                arr[2][3] = 2;
            } else if (a == 0 && b == 5) {
                arr[1][7] = 2;
                arr[2][4] = 2;
            } else if (a == 0 && b == 6) {
                arr[1][4] = 2;
                arr[2][7] = 2;
            } else if (a == 1 && b == 0) {
                arr[0][2] = 2;
                arr[2][2] = 2;
            } else if (a == 1 && b == 1) {
                arr[0][3] = 2;
                arr[2][3] = 2;
                arr[3][0] = 2;
            } else if (a == 1 && b == 2) {
                arr[0][4] = 2;
                arr[2][4] = 2;
                arr[3][1] = 2;
            } else if (a == 1 && b == 3) {
                arr[0][5] = 2;
                arr[2][5] = 2;
                arr[3][2] = 2;
            } else if (a == 1 && b == 4) {
                arr[0][6] = 2;
                arr[2][6] = 2;
                arr[3][3] = 2;
            } else if (a == 1 && b == 5) {
                arr[0][7] = 2;
                arr[2][7] = 2;
                arr[3][4] = 2;
            } else if (a == 1 && b == 6) {
                arr[0][4] = 2;
                arr[2][4] = 2;
                arr[3][7] = 2;
            } else if (a == 1 && b == 7) {
                arr[0][5] = 2;
                arr[2][5] = 2;
            } else if (a == 2 && b == 0) {
                arr[1][2] = 2;
                arr[3][2] = 2;
            } else if (a == 2 && b == 1) {
                arr[1][3] = 2;
                arr[3][3] = 2;
                arr[4][0] = 2;
            } else if (a == 2 && b == 2) {
                arr[1][4] = 2;
                arr[3][4] = 2;
                arr[4][1] = 2;
            } else if (a == 2 && b == 3) {
                arr[1][5] = 2;
                arr[3][5] = 2;
                arr[4][2] = 2;
            } else if (a == 2 && b == 4) {
                arr[1][6] = 2;
                arr[3][6] = 2;
                arr[4][3] = 2;
            } else if (a == 2 && b == 5) {
                arr[1][7] = 2;
                arr[3][7] = 2;
                arr[4][4] = 2;
            } else if (a == 2 && b == 6) {
                arr[1][4] = 2;
                arr[3][4] = 2;
                arr[4][7] = 2;
            } else if (a == 2 && b == 7) {
                arr[1][5] = 2;
                arr[3][5] = 2;
            } else if (a == 3 && b == 0) {
                arr[2][2] = 2;
                arr[4][2] = 2;

            } else if (a == 3 && b == 1) {
                arr[2][3] = 2;
                arr[4][3] = 2;
                arr[5][0] = 2;
            } else if (a == 3 && b == 2) {
                arr[2][4] = 2;
                arr[4][4] = 2;
                arr[5][1] = 2;
            } else if (a == 3 && b == 3) {
                arr[2][5] = 2;
                arr[4][5] = 2;
                arr[5][2] = 2;
            } else if (a == 3 && b == 4) {
                arr[2][6] = 2;
                arr[4][6] = 2;
                arr[5][3] = 2;
            } else if (a == 3 && b == 5) {
                arr[2][7] = 2;
                arr[4][7] = 2;
                arr[5][4] = 2;
            } else if (a == 3 && b == 6) {
                arr[2][4] = 2;
                arr[4][4] = 2;
                arr[5][7] = 2;
            } else if (a == 3 && b == 7) {
                arr[2][5] = 2;
                arr[4][5] = 2;
            } else if (a == 4 && b == 0) {
                arr[3][2] = 2;
                arr[5][2] = 2;
            } else if (a == 4 && b == 1) {
                arr[3][3] = 2;
                arr[5][3] = 2;
                arr[6][0] = 2;
            } else if (a == 4 && b == 2) {
                arr[3][4] = 2;
                arr[5][4] = 2;
                arr[6][1] = 2;
            } else if (a == 4 && b == 3) {
                arr[3][5] = 2;
                arr[5][5] = 2;
                arr[6][2] = 2;
            } else if (a == 4 && b == 4) {
                arr[3][6] = 2;
                arr[5][6] = 2;
                arr[6][3] = 2;
            } else if (a == 4 && b == 5) {
                arr[3][7] = 2;
                arr[5][7] = 2;
                arr[6][4] = 2;
            } else if (a == 4 && b == 7) {
                arr[3][5] = 2;
                arr[5][5] = 2;
            } else if (a == 5 && b == 0) {
                arr[4][2] = 2;
                arr[6][2] = 2;
            } else if (a == 5 && b == 1) {
                arr[4][3] = 2;
                arr[6][3] = 2;
                arr[7][0] = 2;
            } else if (a == 5 && b == 2) {
                arr[4][4] = 2;
                arr[6][4] = 2;
                arr[7][1] = 2;
            } else if (a == 5 && b == 3) {
                arr[4][5] = 2;
                arr[6][5] = 2;
                arr[7][2] = 2;
            } else if (a == 5 && b == 4) {
                arr[4][6] = 2;
                arr[6][6] = 2;
                arr[7][3] = 2;
            } else if (a == 5 && b == 5) {
                arr[4][7] = 2;
                arr[6][7] = 2;
                arr[7][4] = 2;
            } else if (a == 5 && b == 6) {
                arr[4][4] = 2;
                arr[6][4] = 2;
                arr[7][7] = 2;
            } else if (a == 5 && b == 7) {
                arr[4][5] = 2;
                arr[6][5] = 2;
            } else if (a == 6 && b == 0) {
                arr[5][2] = 2;
                arr[7][2] = 2;
            } else if (a == 6 && b == 1) {
                arr[5][3] = 2;
                arr[7][3] = 2;
                arr[4][0] = 2;
            } else if (a == 6 && b == 2) {
                arr[5][4] = 2;
                arr[7][4] = 2;
                arr[4][1] = 2;
            } else if (a == 6 && b == 3) {
                arr[5][5] = 2;
                arr[7][5] = 2;
                arr[4][2] = 2;
            } else if (a == 6 && b == 4) {
                arr[5][6] = 2;
                arr[7][6] = 2;
                arr[4][3] = 2;
            } else if (a == 6 && b == 5) {
                arr[5][7] = 2;
                arr[7][7] = 2;
                arr[4][4] = 2;
            } else if (a == 6 && b == 6) {
                arr[5][4] = 2;
                arr[7][4] = 2;
                arr[4][7] = 2;
            } else if (a == 6 && b == 7) {
                arr[5][5] = 2;
                arr[7][5] = 2;
            } else if (a == 7 && b == 1) {
                arr[6][3] = 2;
                arr[5][0] = 2;
            } else if (a == 7 && b == 2) {
                arr[6][4] = 2;
                arr[5][1] = 2;
            } else if (a == 7 && b == 3) {
                arr[6][5] = 2;
                arr[5][2] = 2;
            } else if (a == 7 && b == 4) {
                arr[6][6] = 2;
                arr[5][3] = 2;
            } else if (a == 7 && b == 6) {
                arr[6][7] = 2;
                arr[5][4] = 2;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
