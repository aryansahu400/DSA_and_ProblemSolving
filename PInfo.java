import java.util.Scanner;
public class PInfo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String a = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your Last Name");
		String b = sc.next();
		int birthYear = 2020-age;
		System.out.println("You are "+a+" "+b+" and you were born in "+birthYear+"");
	}
}