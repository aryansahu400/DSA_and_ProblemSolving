import java.util.*;

public class FindKClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=-1;
        int end=-1;
        List<Integer> ans=new ArrayList<>();
        int index=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(arr[i]-x)<min)
            index=i;
            min=Math.abs(arr[i]-x);
        }

//        set.add(arr[index]);
        k--;
        if(k==1){
            ans.add(arr[index]);
            return ans;
        }
        if(index==0){
            start=0;
            int i=1;
            while(--k>=0){
                i++;
            }
            end=i-1;
        }else if(index==arr.length-1){
            end=arr.length-1;
            int j=index-1;
            while(--k>=0){
                j--;
            }
            start=j+1;
        }else{
            int j=index+1;
            int i=index-1;
            start=index;
            end=index;
            while(--k>=0){
                if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x)){
//                    set.add(arr[i]);
                    i--;
                    start--;
                    if(i==-1){

                        break;
                    }
                }else{
//                    set.add(arr[j]);
                    j++;
                    end++;
                    if(j==arr.length){

                        break;
                    }
                }
            }
            while(--k>=0 && i>=0){
//                set.add(arr[i]);
                i--;
                start--;
                if(i==-1){

                    break;
                }
            }
            while(--k>=0 && j<arr.length){
//                set.add(arr[j]);
                j++;
                if(j==arr.length){

                    break;
                }
            }
        }
        for(int i=start;i<=end;i++){
            ans.add(arr[i]);
        }

            return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int x= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findClosestElements(arr,k,x));
    }
}
/*
[0,1,1,1,2,3,6,7,8,9]
9
4
 */