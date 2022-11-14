import java.util.Scanner;

class Stack<T>{
    Node head;
    static class Node<T>{
        T data;
        Node next;

        Node(T data){
            this.data=data;
            next=null;
        }
    }
    public void push(T data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }
    public Object pop(){
        if(head==null) return null;
        Object r = head.data;
        head=head.next;
        return r;
    }
    public Object peek(){
        if(head==null)return "";
        return head.data;
    }
}

public class Question3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Stack<Integer> s= new Stack<>();
        System.out.print("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elemnets");
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            s.push(temp);
        }
        System.out.print("poped elements : ");
        for(int i=0;i<n;i++){
            System.out.print(s.pop()+" ");
        }

    }
}