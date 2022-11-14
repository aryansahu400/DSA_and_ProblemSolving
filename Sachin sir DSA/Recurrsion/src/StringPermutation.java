import java.util.*;

public class StringPermutation {

    private  static void swap(StringBuilder s, int i, int index){
        char temp=s.charAt(i);
        s.replace(i,i+1,s.charAt(index)+"");
        s.replace(index,index+1,temp+"");
    }
    private static void solve(StringBuilder s,HashSet<String> ans, int index){
        if(index>=s.length()){

            ans.add(s.toString());

            return;
        }
        for(int i=index;i<s.length();i++){
            swap(s,i,index);
            solve(s,ans,index+1);
            swap(s,i,index);
        }
        return;
    }
    private static HashSet<String> printPermutation(String s){
        HashSet<String> ans=new HashSet<>();
        solve(new StringBuilder(s),ans, 0);
        System.out.println(ans.size());
        return ans;
    }
    public static void main(String[] args) {
        String s=(new Scanner(System.in)).next();

        System.out.println(printPermutation(s));
    }
}
