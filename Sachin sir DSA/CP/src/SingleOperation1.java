import java.util.Scanner;

public class SingleOperation1 {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0) {
//            int n=sc.nextInt();
//            String number=sc.next();
            for (int x = 1; x < 100; x++) {
//                int x = Integer.parseInt(number, 2);
                int min = Integer.MAX_VALUE;
                int ans = 0;
                int var = 2;
                for (int i = 1; i <= x; i++) {
                    int temp = (int) x / var;
                    int r = x ^ temp;
                    if (r < min) {
                        min = r;
                        ans = i;
                    }
                    var = var * 2;
                    if (var == 0) break;
                    if (var > 2 * x) break;
                }
                System.out.print("x= "+x+" "+ans+"       ");
            }
        }
    }
}
