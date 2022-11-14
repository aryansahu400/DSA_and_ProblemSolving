import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0) {
            int n = sc.nextInt();
            String s = sc.next();
            int p=0;;
            int m=0;
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='+'){
                    p++;
                } else if (s.charAt(i)=='-') {
                    m++;
                }else{
                    al.add(s.charAt(i)-'0');
                }
            }
            Collections.sort(al);
            int index=0;
            StringBuilder ans=new StringBuilder();
            while(--m>=0){
                ans.insert(0,al.get(index));
                index++;
                ans.insert(0,'-');
            }

            for(int i=0;i<=p;i++){
                ans.insert(0,al.get(index));
                index++;
                if(i==p)continue;
                ans.insert(0,'+');
            }
            while(index<al.size()){

                ans.insert(0,al.get(index));
                index++;
            }
            System.out.println(ans);
        }
    }
}
