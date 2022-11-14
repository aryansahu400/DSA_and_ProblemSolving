import java.util.Scanner;

public class IsPalindrome {
    static int i=-1;
    private static boolean isPalindrome(String s){
        i++;
        int j=s.length()-i-1;
        if(i>j){
            i=-1;
            return  true;
        }
        if(s.charAt(i)!=s.charAt(j))return false;
        else return isPalindrome(s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(isPalindrome(sc.next()));
    }

}
