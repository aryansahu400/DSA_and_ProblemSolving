import java.util.Scanner;

public class SingleOperation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0) {
            System.out.println(solve(sc));
//            int n = sc.nextInt();
//            String s = sc.next();
//            int x=Integer.parseInt(s,2);
//            int temp=x;
//            int seriesNumber=0;
//            while(temp>1){
//                seriesNumber++;
//                temp=temp/2;
//            }
//            int lastNumber=seriesNumber+1;
//            int lowerBound=(int)Math.pow(2,seriesNumber);
//            int upperBound=(int)(Math.pow(2,seriesNumber+1)-1);
////            System.out.println(seriesNumber);
////            System.out.println(lowerBound +" "+ upperBound);
//            int arr[]=new int[lowerBound];
//            int fill=1;
//            int power=lowerBound/2;
//            int powertemp=power;
//            for(int i=lowerBound-1;i>=0;i--){
//                arr[i]=fill;
//                powertemp--;
//                if(powertemp==0){
//                    power=power/2;
//                    powertemp=power;
//                    fill++;
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//            int index=x-lowerBound;
//            System.out.println(arr[index]+" ");
        }

    }
    public static int solve(Scanner sc){
        int n=sc.nextInt();
        String str=sc.next();
        int max=Integer.MAX_VALUE;
        int ans=0,temp=0, incrementer=0 ;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                temp+=Math.pow(2, incrementer);
            }
            incrementer++;
        }
        for (int i = 1; i <=str.length() ; i++) {
            int faltu=(int)(temp/Math.pow(2,i));
            faltu=temp^faltu;
            if(faltu<max){
                max=faltu;
                ans=i;
            }
        }
        return ans;
    }

}
