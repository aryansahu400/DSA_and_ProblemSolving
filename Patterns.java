import java.util.Scanner;
public class Patterns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println();
		System.out.println("Pattern 1:");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Pattern 2:");
		System.out.println();

		int temp;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				temp=1;
			}
			else
			{
				temp=0;
			}
				
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				if(temp==1)
				{
					temp=0;
				}
				else
				{
					temp=1;
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println("Pattern 3:");
		System.out.println();

		for(int i=n;i>=1;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println("Pattern 4:");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Pattern 5:");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}	
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println("Pattern 6:");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}	
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}	
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}