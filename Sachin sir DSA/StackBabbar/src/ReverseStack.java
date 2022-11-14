import java.util.Scanner;

public class ReverseStack {
    private static void reverseStack(Stack s){//O(n2)
        if(s.isEmpty())return ;
        Object temp=s.pop();
        reverseStack(s);
        InsertAtBottom.insertAtBottom(s,temp);//uses another method called inserAtBottom
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        Stack s=new Stack<>();
        for(int i=0;i<n;i++){
            s.push(sc.next());
        }

        reverseStack(s);
        System.out.println(s);
    }
}
