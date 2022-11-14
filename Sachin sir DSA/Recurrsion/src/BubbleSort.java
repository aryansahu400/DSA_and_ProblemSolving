public class BubbleSort {
    private static void sortArray(int[] arr, int n) {
        if (n == 0 || n == 1) return;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
        sortArray(arr,--n);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{6,213,431,34,1,123,3};
        sortArray(arr,7);
        for(int i:arr) System.out.print(i+" ");

    }
}
