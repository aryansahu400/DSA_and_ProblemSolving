import java.io.*;

public class Test{
	public static void main(String[] args){
		try{
			FileReader fr=new FileReader("in.txt");
			FileWriter fw=new FileWriter("out.txt");

			int i; String s="";
			
			while((i=fr.read())!=-1){
				s+=(char)i;
			}
			String[] nums=s.split(" ");
			int a=Integer.parseInt(nums[0]);
			int b=Integer.parseInt(nums[1]);

			int c=a+b;
			String result=c+"";
			fw.write(result);
			fr.close(); fw.close();
		}catch(IOException e){}
	}
}