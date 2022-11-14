import java.util.Scanner;

public class RemoveMidElement {
    private static void removeEle(Stack<Object> s, int size, int capacity){
        if(size==(capacity/2)+1){
            s.pop();
            return;
        }
        Object temp=(int)s.pop();
        removeEle(s,s.getSize(),capacity);
        s.push(temp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack<>(n);
        for (int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        removeEle(s, s.getSize(), s.getSize());
        System.out.println(s);
    }
}
