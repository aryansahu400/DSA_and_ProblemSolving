public class RotateArray {
    private static int[] rotate(int[] nums, int k){
        int n=nums.length;

        int [] arr=new int[k];
        int index=0;
        for(int i=n-k;i<n;i++){
            arr[index]=nums[i];
            index++;
        }
        index=0;
        for(int i=k;i<n;i++){
            nums[i]=nums[index];
            index++;
        }
        index=0;
        for(int i=k+1;i<n;i++){
            nums[i]=arr[index];
            index++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        arr=rotate(arr,3);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
//[1,2,3,4,5,6,7]
//3