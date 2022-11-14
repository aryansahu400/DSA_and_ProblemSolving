//Question: check if the given string contains all the alphabets of the english language

//approach1 : take a boolean array of 26 characters. by using the current elemnt -'a' incremnet the array
//if any value is false return return


import java.util.Scanner;

public class IsPanagram {
    private static boolean isPanagram(String s){
        if (s.length()<26)return false;
        boolean[] arr=new boolean[26];
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            Character.toLowerCase(temp);
            if(temp==' ')continue;
            if(!(temp>='a' && temp<='z'))return false;
            arr[(int)temp-(int)'a']=true;

        }
        for(int i=0;i<26;i++){
            if(arr[i]==false)return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        if(isPanagram((new Scanner(System.in)).nextLine())) System.out.println("it is a panagram");
        else System.out.println("Not a panagram");
    }
}
