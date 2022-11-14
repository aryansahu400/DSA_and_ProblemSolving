//approach: loop inside loop

import java.util.Scanner;

public class SubStringPrint {
    private static void print(String s){
        int n=0;
        for(int i=0;i<s.length();i++){
            StringBuilder temp=new StringBuilder();
            for(int j=i;j<s.length();j++){
                temp.append(s.charAt(j));
                System.out.println((++n)+": "+temp);

            }
        }
    }

    public static void main(String[] args) {
        String s=(new Scanner(System.in)).next();
        print(s);
    }
}
