import java.util.HashMap;
public class BalancedParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack(s.length());

        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            char temp=getBracket(s.charAt(i));
            if(stack.peek()==temp){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())return true;
        else return false;
    }

    private static char getBracket(char c) {
        if(c==')')return '(';
        else if (c=='}') return '{';
        else if(c==']')return '[';
        else return '!';
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
