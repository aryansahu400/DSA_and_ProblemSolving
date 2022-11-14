import java.util.Scanner;

public class BinarySub {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            String s=sc.next();
            long ab=0;
            long ba=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='a' && s.charAt(i+1)=='b'){
                    ab++;
                }
            }
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                    ba++;
                }
            }
            if(ab!=0)ab=(ab*2)%998244353;
            if(ba!=0)ba=(ba*2)%998244353;
            if(ab==0)ab++;
            if(ba==0)ba++;

            System.out.println(ab*ba);

        }
    }
}
