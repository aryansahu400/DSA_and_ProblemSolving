//Question: Given a string in format aabdddcsssd, if a character comes more than once thne afetr it append the
// the number of times it comes, if only one occurane is found just print it

import java.util.Scanner;

public class CompressString {
    private static StringBuilder converter(String s){
        StringBuilder res=new StringBuilder();
        int count=1;
        for(int i=0;i<s.length()-1;i++){

            if(s.charAt(i)==s.charAt(i+1)){
                count++;

            }else{
                res.append(s.charAt(i));
                if(count!=1)res.append(count);
                count=1;
            }
            if(i==s.length()-2){
                if(s.charAt(i)!=s.charAt(i+1)){
                    res.append(s.charAt(i+1));
                }else{
                    res.append(s.charAt(i+1));
                    res.append(count);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(converter((new Scanner(System.in).next())));
    }

}
