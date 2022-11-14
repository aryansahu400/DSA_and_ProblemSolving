import java.io.*;

public class Temp {
    public static void merge(String[] arr, int start, int end){
        int mid=(start+end)/2;
        int n=mid-start+1;
        int m=end-mid;
        String[] a=new String[n];
        String[] b=new String[m];
        int index=start;
        for(int i=0;i<n;i++){
            a[i]=arr[index++];
        }
        for(int i=0;i<m;i++){
            b[i]=arr[index++];
        }

        index=start;

        int i=0,j=0;
        while(i<n && j<m){
            if(a[i].length()>b[j].length()){
                arr[index++]=b[j++];
            }else if(b[j].length()>a[i].length()){
                arr[index++]=a[i++];

            }
            else if(a[i].compareTo(b[j])>0){

                    arr[index++] = b[j++];

            }else{
                arr[index++]=a[i++];
            }
        }
        while(i<n){
            arr[index++]=a[i++];
        }
        while(j<m){
            arr[index++]=b[j++];
        }
    }
    public static void mergeSort(String[] arr, int start, int end)
    {
//        System.out.println('h');
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start, mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,end);
    }
    public static void main(String[] args)throws IOException{


        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=bf.readLine();
        }
        mergeSort(arr,0,n-1);
        for(String i:arr){
            System.out.println(i);
        }
    }
}
