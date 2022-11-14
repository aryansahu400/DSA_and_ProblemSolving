import java.util.Scanner;

public class Reverse {
    private static int[] reverse(int[] arr){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i< arr.length;i++){
            s.push(arr[i]);
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=s.pop();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
