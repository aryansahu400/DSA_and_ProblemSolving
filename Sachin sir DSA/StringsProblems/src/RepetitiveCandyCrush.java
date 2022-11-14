import java.util.Scanner;

/*
Question: If a character comes twice consecutively, remove those two characters
 */
public class RepetitiveCandyCrush {
    private static String encoder(String str){
        StringBuilder s=new StringBuilder(str);
        int i=0;
        while(i!=s.length()-1){
            if(i<0)i=0;
            if(i>=s.length())break;
            if(s.charAt(i)==s.charAt(i+1)){
                s.delete(i,i+2);
                i--;
                continue;
            }
            i++;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(encoder((new Scanner(System.in)).next()));
    }

}
