//sort array of 0 and 1

//logic 1: twopointer approach se scaiing ke time swaping

//logic two count zeros and one, print zero first then 1

public class Sort0And1 {
    private static void twoPointerApproach(int[] arr){//O(n){
        int n=arr.length;
        int i=0;int j=n-1;
        int count=0;// kitni baar chalega
        while(i<j){
            count++;
            if(arr[i]==1){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[j]^arr[i];
                arr[i]=arr[i]^arr[j];
                j--;
            } else if (arr[i]==0) {
                i++;
            }
        }
        System.out.println("Number of times itrated= "+count);

    }
    private static void countZeros(int [] arr){//O(2n)
        int count=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            count++;
            if(arr[i]==0)zero++;
        }
        for(int i=0;i<zero-1;i++){
            count++;
            arr[i]=0;
        }
        for(int i=zero;i<arr.length;i++){
            count++;
            arr[i]=1;
        }
        System.out.println("Number of times itrated = "+count);
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
        int arr2[]={1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
        twoPointerApproach(arr);
        countZeros(arr2);
        for (int i:arr) {
            System.out.print(i);
        }
        System.out.println();
        for (int i:arr2) {
            System.out.print(i);
        }
    }
}
