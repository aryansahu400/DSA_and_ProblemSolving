public class MultipleDuplicates {
    private static void findDuplicates(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int temp=Math.abs(arr[i]);
            if(arr[temp]>0){
                arr[temp]=arr[temp]*(-1);
            }else{
                System.out.print(temp+" ");
            }

        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,4,5,8,3};
        findDuplicates(arr);

    }
}
