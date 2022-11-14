public class ValidPalindromeLeetCode {
    private static  boolean isValidPalindrome(String s){
        int n=s.length();
        int i=0;
        int j=s.length()-1;
        while(i<n){
            char left;
                if(s.charAt(i)>='a' && s.charAt(i)<='z')left=s.charAt(i);
            else if (s.charAt(i)>='A' && s.charAt(i)<='Z')left=(char)(s.charAt(i)+32);
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9')left=s.charAt(i);
            else{
                i++;
                continue;
            }
            char right;
            if(s.charAt(j)>='a' && s.charAt(j)<='z')right=s.charAt(j);
            else if (s.charAt(j)>='A' && s.charAt(j)<='Z')right=(char)(s.charAt(j)+32);
            else if(s.charAt(j)>='0'&&s.charAt(j)<='9')right=s.charAt(j);
            else{
                j--;
                continue;
            }

            if(left!=right)return false;
            else{
                i++;
                j--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan,k a canal: Pkanama."));
    }
}
