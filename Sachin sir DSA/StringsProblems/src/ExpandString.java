//Given string str of the type 3(as)4(bd), the task is to expand it to asasasbdbdbdbd

import java.util.Scanner;

public class ExpandString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder res=new StringBuilder();
        int temp=(int)s.charAt(0)-48;
        for(int i=2;i<s.length();i++){
            StringBuilder t=new StringBuilder();
            while(s.charAt(i)!=')'){
                t.append(s.charAt(i));
                i++;
            }
            res.append(String.valueOf(t).repeat(Math.max(0, temp)));
            if(i==s.length()-1)continue;
            i++;
            temp=(int)s.charAt(i)-48;
            i++;
        }
        System.out.println(res);
    }
}
