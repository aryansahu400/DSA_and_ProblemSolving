public class RedundantBrackets {
    public static boolean isRedundant(Stack s){
        boolean bracket=false;
        boolean op=false;
        int n=s.getSize();
        for(int i=0;i<n;i++){
            char c=(Character)s.pop();
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                op=true;
            }
            else if(c=='(') {
                bracket=true;
                break;
            }
        }
        if(bracket && op){
            return false;
        }else{
            return true;
        }
    }

    public static boolean findRedundantBrackets(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')continue;
            else if(s.charAt(i)=='('||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(isRedundant(stack))return true;
            }
        }

        return false;
    }
}
