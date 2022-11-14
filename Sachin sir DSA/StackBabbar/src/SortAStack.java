import java.util.Scanner;

public class SortAStack {
    public static void insertSorted(Stack<Integer> s, int temp){
        if(s.isEmpty()){
            s.push(temp);
            return;
        }
        int top=s.peek();
        if(top>=temp){
            int t=s.pop();
            insertSorted(s,temp);
            s.push(t);
        }else{
            s.push(temp);
        }
    }
    public static void sort(Stack<Integer> s){
        if(s.isEmpty())return;
        int temp=s.pop();
        sort(s);
        insertSorted(s,temp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        sort(stack);
        System.out.println(stack);
    }
}
