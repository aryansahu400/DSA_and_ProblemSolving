import java.util.Scanner;

public class ArrayLinearSerch {
    static int index=0;
    private static boolean isPresent(int[] arr,int key){
        index++;
        if(index==arr.length){
            index=-1;
            return false;
        }
        if(arr[index]==key)return true;

        return isPresent(arr, key);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to find: ");
        int key=sc.nextInt();
        System.out.println(isPresent(arr,key));
    }
}
