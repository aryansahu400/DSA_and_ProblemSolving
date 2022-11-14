import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] c, int start, int end) {
        int mid=(start+end)/2;
        int m=mid-start+1;
        int n=end-mid;
        int[] a=new int[m];
        int[] b=new int[n];
        int originalArrayIndex = start;
        for(int i = 0; i < m; i++){
            a[i] = c[originalArrayIndex++];
        }



        for(int i = 0; i < n; i++){
            b[i] = c[originalArrayIndex++];
        }
        int k=start;

        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k++]=a[i++];

            }else{
                c[k++]=b[j++];


            }
        }
        while(j<n){
                c[k++]=b[j++];
        }
        while(i<m){
                c[k++]=a[i++];
        }


    }
    public static void mergeSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);
    }
    public static void main(String[] args) {
        int[] a={2,5,3,1,4,5,234,5,23,43,55};
        mergeSort(a,0, a.length-1);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
