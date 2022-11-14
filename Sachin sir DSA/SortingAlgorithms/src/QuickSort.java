import java.util.Scanner;

public class QuickSort {
    private static int partition(int[] arr, int start, int end){
        if(start==end)return start;
        int pivot=arr[start];
        int count=0;
        // 5 2 6 3 4
        for(int i=start+1;i<=end;i++){
            if(arr[i]<pivot)count++;
        }
        int index=start+count;
        int temp=arr[index];
        arr[index]=arr[start];
        arr[start]=temp;
        int i=start,j=end;
        while(i<j){
            if(arr[i]>arr[index]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            } else if (arr[j]<arr[index]) {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }else{
                i++;j--;
            }

        }
        return index;

    }
    private static void quickSort(int[] arr, int start, int end){
        if(start>=end)return;
        int pivot=partition(arr, start, end);
        quickSort(arr,start, pivot-1);
        quickSort(arr,pivot+1,end );
    }
    public static void sort(int[] arr){
        quickSort(arr,0, arr.length-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        partition(arr,0,n-1);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
