import java.util.HashMap;

public class LongPressedName {
    public static boolean isLong(String name, String typed){
        int arr[]=new int[52];
        for(int i=0;i<name.length();i++){
            int index=0;
            char temp=name.charAt(i);
            if(temp<='z'){
                index=temp-'a';
            }else{
                index=temp-'A'+26;
            }
            arr[index]++;
        }
        for(int i=0;i<typed.length();i++){
            int index=0;
            char temp=typed.charAt(i);
            if(temp<='z'){
                index=temp-'a';
            }else{
                index=temp-'A'+26;
            }
            arr[index]--;
        }
        for(int i=0;i<52;i++){
            if(arr[i]>0)return false;
        }
        return true;
    }
    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int n=name.length();
        int m=typed.length();
        if(n>m)return false;
        while(i<n && j<m){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(i>0&& name.charAt(i-1)==typed.charAt(j)){
                j++;
            }else{
                return false;
            }
        }
        if(i==n && j==m)return true;
        if(i<n)return false;

        while(j<m){
            if(name.charAt(i-1)!=typed.charAt(j))return false;
            j++;

        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("rick"
                ,"riccckkkkkk"));
    }
}
