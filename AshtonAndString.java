

import java.util.*;



public class AshtonAndString {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int tt=1;tt<=t;tt++)
        {
            String s=sc.next();
            int k=sc.nextInt();
            System.out.println(ashtonString(s,k));
        }
        sc.close();
    }
    static char ashtonString(String s, int k) {
        int len=s.length();
        // char c[]=new char[len];
        // for(int i=0;i<len;i++)
        // {
        //     c[i]=s.charAt(i);
        // }
        // Arrays.sort(c);
        ArrayList<String> al=new ArrayList<>();
        // for(int i=0;i<len;i++)
        // {
            for(int j=0;j<len;j++)
            {
                String toconcat="";
                for(int l=j;l<len;l++)
                {
                    toconcat+=s.charAt(l);
                    al.add(toconcat);
                }
                
            }
        // }
        System.out.println("Unsorted="+al);
        Collections.sort(al);
        System.out.println("sorted"+al);
            String fina="";
            for(int i=0;i<al.size();i++)
            {
                fina+=al.get(i);
            }
        
        // for(String e:ss)
        // {
        //     System.out.print(e+" ");
        // }
        System.out.println(fina);
        return fina.charAt(k-1);

    }
    
}
