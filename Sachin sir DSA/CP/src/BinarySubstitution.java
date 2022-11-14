import java.util.Scanner;

public class BinarySubstitution {

    public static long pow(long a, long b){
        if(b==1)return a;
        if(b==0)return 1;
        long p=pow(a,b/2)%998244353;
        if(b%2==0){
            return (p*p)%998244353;
        }else{
            return (2*p*p)%998244353;
        }
    }
    public static void main (String[] args) throws java.lang.Exception	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0) {
            String s = sc.next();
            long ab = 0;
            long ba = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') ab++;
                if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') ba++;
            }


            if (ba == 0 && ab == 0) {
                System.out.println(1);

                continue;
            }
            int sum = 0;
            if (ab >= 1)
                sum += pow(2, ab);
            if (ba >= 1)
                sum += pow(2, ba);
            System.out.println(sum);
        }
    }
}


