import java.util.Scanner;
public class QuestionOne {
    public static boolean isPrime(int n){
        if(n==1) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Inclusive Range: [");
      int l=sc.nextInt();
      System.out.print("-");
      int r=sc.nextInt();
      System.out.print("]");
      System.out.println("Prime numbers in the Range ["+l+"-"+r+"] are: " );
      for(int i=l;i<=r;i++){
          if(isPrime(i)) System.out.print(i+" ");
      }
    }
}