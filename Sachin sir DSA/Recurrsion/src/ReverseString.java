import java.util.Scanner;

public class ReverseString {
    static int i=-1;
    public static StringBuilder reverse(StringBuilder s){
        i++;
        int j=s.length()-i-1;
        if(i>j){
            i=-1;
            return s;
        }
        char temp=s.charAt(i);
        s.replace(i,i+1,s.charAt(j)+"");
        s.replace(j,j+1,temp+"");
        return reverse(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.next());
        System.out.println(reverse(s));

    }
}
