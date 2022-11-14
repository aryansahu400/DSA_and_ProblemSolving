import java.util.*;
import java.lang.*;
import java.io.*;


class Decrypt
{
	public static void main (String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s=sc.next();
		char eng[]=new char[26];
		char byt[]=new char[26];
		int lk=0;
		for(char c='a';c<='z';c++)
		{
		    eng[lk]=c;
		    lk++;
		}
		lk=0;
		for(int i=0;i<26;i++)
		{
		    byt[i]=s.charAt(i);
		}
		for(int tt=1;tt<=t;tt++)
		{
		    String test=sc.next();
		    String ans="";
		    for(int j=0;j<test.length();j++)
		    {
		        char temp=test.charAt(j);
		        
		        for(int i=0;i<26;i++)
		        {
		            if(temp==byt[i])
		            {
		                ans.concat(eng[i]+"");
		                break;
		            }
		            if(i==26)
		            {
		                if (temp=='_')
		                {
		                    ans.concat(" ");
		                    break;
		                }else{
		                    ans.concat(temp+" ");
		                    break;
		                }
		            }
		        }
		    }
		    System.out.println(ans);
		}
		
	}
}