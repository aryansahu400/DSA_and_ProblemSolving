import java.util.Scanner;

public class Fibbonacci {
    private static long fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib((new Scanner(System.in)).nextInt()));
    }
}
