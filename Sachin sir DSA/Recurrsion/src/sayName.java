import java.util.Scanner;

class SayName {

    static class Cal{
        static String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};

        private static void sayName(int n){
            if(n==0)return;
            int digit=n%10;
            sayName(n/10);
            System.out.print(arr[digit]+" ");
        }
    }

    public static void main(String[] args) {
        Cal.sayName((new Scanner(System.in)).nextInt());
    }
}
