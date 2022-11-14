import java.util.Scanner;
public class PrimeOrNot{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		int a=sc.nextInt();
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println(a+" is prime");
		}else{
			System.out.println(a+" is not prime");
		}
	}
}