import java.util.Scanner;

public class CircularLL {
    Node tail;
    int size;
    static class Node{
        protected int data;
        protected Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void insertAtTail(int data){
        size++;
        if(tail==null){
            tail=new Node(data);
            tail.next=tail;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=tail.next;
        tail.next=newNode;
        tail=newNode;
    }

    public void insertAtHead(int data){
        size++;
        if(tail==null){
            tail=new Node(data);
            tail.next=tail;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=tail.next;
        tail.next=newNode;
        return;
    }
    public void print(){
        Node head=tail.next;
        while(true){
            System.out.print(head.data+" ");
            head=head.next;
        }
//        System.out.println(head.data);
//        System.out.println();
    }
    public void delete(int data){
        if(tail.next==tail){
            tail=null;
            return;
        }
        Node next=tail.next;
        Node prev=tail;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CircularLL head=new CircularLL();
        CircularLL tail=new CircularLL();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            tail.insertAtTail(temp);
            head.insertAtHead(temp);
        }
        tail.print();
        head.print();
    }
}
