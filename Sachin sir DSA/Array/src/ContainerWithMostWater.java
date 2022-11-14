public class ContainerWithMostWater {
    public static int maxArea(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int maxArea=0;
        while(end>start){
            int width=end-start;
            int height=Math.min(arr[start], arr[end]);
            int area=width*height;
            if(area>maxArea)maxArea=area;
            if(arr[start]<arr[end])start++;
            else end--;
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
