import java.util.Scanner;

public class InsertAtBottom {
    public static void insertAtBottom(Stack s, Object val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        Object temp=s.pop();
        insertAtBottom(s,val);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        insertAtBottom(s,3);
        System.out.println(s);
    }
}
