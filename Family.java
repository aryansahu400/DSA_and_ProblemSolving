import java.util.*;
public class Family{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Type 1 and press enter to start");
		int tt=sc.nextInt();
		if(t==1)
		{
			long start=System.currentTimeMillis();
			long end=start+60*1000;
		
			while(System.currentTimeMillis() < end)
			{
			 	s=sc.nextLine();
			}
			String ss[]=s.split(" ");
			float n=ss.length;
			System.out.println("Total words typed= "+(int)n);
			System.out.println("words per minute= "+(float)(n/60));
		}
		else
		{
			System.out.println("Wrong Input");
		}

		
	}
}