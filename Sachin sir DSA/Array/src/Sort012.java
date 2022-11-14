//sort array containing 1,2 and 0

//logic1 O(n): count (n) but only prints does not update array

/*logic 2 O(n): current elemet, left element, or right element ko leke chalo
swap curr to with left if current elemt is 0, then increment current and left ko
swap curr with right if current ele = 2, then decremnet right, ** but do not increment cur as it can bring a 0 with it
do nothing if one is found

 */

public class Sort012 {
    private static void count(int[] arr){
        int zero=0;
        int one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)zero++;
            else if (arr[i]==1)one++;
        }
        for(int i=0;i<zero;i++){
            System.out.print(0+" ");
        }
        for(int i=zero;i<one+zero;i++){
            System.out.print(1+" ");
        }
        for(int i=zero+one;i< arr.length;i++){
            System.out.print(2+" ");
        }
    }
    private static void threePointerArrayUpdate(int[] arr){
        int n=arr.length;
        int i=0,j=n-1, curr=0;
        while(curr<=j){
            if(arr[curr]==0){
                arr[i]=arr[i]^arr[curr];
                arr[curr]=arr[curr]^arr[i];
                arr[i]=arr[i]^arr[curr];
                i++;
                curr++;


            }else if(arr[curr]==2){

                arr[j]=arr[j]^arr[curr];
                arr[curr]=arr[curr]^arr[j];
                arr[j]=arr[j]^arr[curr];
                j--;


            }else curr++;



        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,1,2,2,1,1,0,0,0,1,2,0};
        count(arr);
        threePointerArrayUpdate(arr);
        System.out.println();
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
