import java.util.Scanner;

public class MainakAndInterestingSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            if(m==0){
                for(int i=0;i<n;i++){
                    System.out.print(0+" ");
                }
                System.out.println();
                continue;
            }

//            if(m<n) {
//                System.out.println("No");
//                continue;
//            }

            if(m%n==0){
                System.out.println("Yes");
                int temp=m/n;

                for(int i=0;i<n;i++){
                    System.out.print(temp+" ");
                }
                System.out.println();
            }else{
                System.out.println("No");
            }

        }
    }
}
