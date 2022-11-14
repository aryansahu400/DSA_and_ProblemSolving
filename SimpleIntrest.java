import java.util.Scanner;
public class SimpleIntrest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal");
		long p = sc.nextLong();
		double pp = p;
		System.out.println("enter the time period");
		int t = sc.nextInt();
		double tt = t;
		System.out.println("enter the rate of intrest");
		double r = sc.nextDouble();
		double a =(pp*tt*r)/100;
		System.out.println("the payble amount is"+a);
	}
}
		