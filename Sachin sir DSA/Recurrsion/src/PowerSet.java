import java.util.*;
public class PowerSet {
    private static void create(List<List<Integer>> ans, List<Integer>curr, int[] arr, int i){

        if(i>=arr.length){
            List<Integer> copy=new ArrayList<>();
            for(int ii=0;ii<curr.size();ii++){
                copy.add(curr.get(ii));
            }
            ans.add(copy);

            return;
        }

        create(ans,curr,arr,i+1);
        curr.add(arr[i]);
        create(ans,curr,arr,i+1);
        curr.remove(curr.size()-1);

        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> c=new ArrayList<>();


        create(ans,c,arr,0);

        System.out.println(ans);
    }
}
