import java.util.Scanner;

public class qAtwo {
    public static long gcd(long a, long b) {

        if (b == 0)
            return a;

        else
            return gcd(b, a % b);
    }
    public static long lcm(long a, long b, long gcdValue)
    {
        return Math.abs(a * b) / gcdValue;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (--t >= 0) {
            int n = sc.nextInt();

            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.println("a= " + i + " b=" + j);
                    long g = gcd(i, j);
                    long l = lcm(i, j, g);
                    System.out.println("    l= " + l + " g=" + g + " l/g=" + (l / g));
                    if (l / g <= 3) {
                        count++;
                        if (i != j) count++;
                    }

                }
            }
            System.out.println(count);
        }
    }
}
