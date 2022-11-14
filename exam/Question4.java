import java.util.Scanner;
@SuppressWarnings("unchecked")
class Node<T>{
    T data;
    Node next;
    
    Node(T data){
        this.data=data;
        next=null;
    }
}

class Queue<T>{
    Node head;
    Node tail;
    
    //insertion operation
    public void enQueue(T data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }
    
    //deletion operation
    public Object deQueue(){
        if(head==null)return null;
        Object r=head.data;
        head=head.next;
        return r;
    }
    
   
}

public class Question4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Queue<Integer> q= new Queue<>();
        System.out.print("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elemnets");
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            q.enQueue(temp);
        }
        System.out.print("poped elements : ");
        for(int i=0;i<n;i++){
            System.out.print(q.deQueue()+" ");
        }
        
    }
}