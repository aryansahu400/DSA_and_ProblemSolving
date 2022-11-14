import java.io.*;
class Main{
    public static void main(String[] args)throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String var=sc.readLine();
        String arr[]=var.split(" ");
	   double x=Double.parseDouble(arr[0]);
	   double y=Double.parseDouble(arr[1]);
	   if(x>y)
	   {
	       System.out.println(y);
	   }
	   else if(x%5==0)
	   {
            double result=(double)((y-x)-0.5);
            System.out.println(result);
	   }
	   else
	   {
	       System.out.println(y);
	   }
    }
}