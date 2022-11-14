public class SecondSmallest {
    private static int secondSmallest(int[] arr){
        int sencondMin;
        int min=sencondMin=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){

                    sencondMin = min;
                    min = arr[i];

            }else{
                if(arr[i]<sencondMin && arr[i]!=min){
                    sencondMin=arr[i];
                }
            }
        }
        return sencondMin;
    }

    public static void main(String[] args){
        int[] arr={2,2,2,2,1,2};
        System.out.println(secondSmallest(arr));
    }
}
