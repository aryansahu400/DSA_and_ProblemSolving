//approch: two pointer approach jaha pe same nah ho vaha pe false return kr jana

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {

        String s=(new Scanner(System.in)).next();
        if(isPalindrome(s)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
