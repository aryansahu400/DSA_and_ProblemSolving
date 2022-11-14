import java.util.Scanner;

public class DoublyLL<E> {
    private Node head;
    private Node tail;
    private int size;

    //getter setter methods
    public Node getHead() {
        return head;
    }public void setHead(Node head) {
        this.head = head;
    }public Node getTail() {
        return tail;
    }public void setTail(Node tail) {
        this.tail = tail;
    }public int getSize() {
        return size;
    }public void setSize(int size) {
        this.size = size;
    }

    static class Node<E>{
        E data;
        Node next;
        Node prev;
        Node(E data){
            this.data=data;
            next=null;
            prev=null;
        }
    }

    public void insertAtHead(E data){
        size++;
        if(head==null){
            head=new Node(data);
            tail=head;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return;
    }
    public void insertAtTail(E data){
        size++;
        if(head==null){
            head=new Node(data);
            tail=head;
            return;
        }
        Node newNode=new Node(data);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        return;
    }

    public void insertAt(int index, E data){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException for index "+index+" for size "+size);
        }
        if(index==0){
            insertAtHead(data);
            return;
        }else if(index==size){
            insertAtTail(data);
            return;
        }
        size++;
        index--;
        Node iteratorNode=head;
        for(int i=0;i<index;i++){
            iteratorNode=iteratorNode.next;
        }
        Node newNode=new Node(data);
        newNode.next=iteratorNode.next;
        newNode.prev=iteratorNode;
        iteratorNode.next=newNode;
        newNode.next.prev=newNode;
    }


    //traversing
    public void tailTraverse(){
        Node temp=tail;
        while(temp.prev!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println(temp.data);
        System.out.println();
    }
    public void headTraverse(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DoublyLL<Integer> l=new DoublyLL<>();
        for(int i=0;i<n;i++){
            l.insertAtTail(sc.nextInt());
        }

        l.headTraverse();
        l.tailTraverse();
    }
}
