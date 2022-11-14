import java.util.EmptyStackException;
public class Stack<T> {
    static class Node<T>{
        private T data;
        private Node next;

        Node(T data){
            this.data=data;
            this.next=null;
        }
    }

    private int capacity=Integer.MAX_VALUE;
    private int size=0;
    private Node top;

    Stack(int size){
        this.capacity=size;
        top=null;
    }
    Stack(){
        top=null;
    }
    public boolean isEmpty(){
        if(size==0)return true;
        else return false;
    }
    public boolean isFull(){
        if(size==capacity)return true;
        else return false;
    }
    public void push(T data){
        if(this.isFull())throw new StackOverflowError(" for size "+capacity);

        size++;
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    public int getSize() {
        return size;
    }

    public T pop(){
        if(this.isEmpty())throw new EmptyStackException();

        size--;
        Node temp=top;
        T data=(T)temp.data;
        top=top.next;
        temp=null;
        return (T)data;
    }

    public T peek(){
        if(this.isEmpty())throw new EmptyStackException();
        return (T)top.data;
    }

    @Override
    public String toString(){
        Node temp=top;
        String ans="[";
        while(temp.next!=null){
            ans+=temp.data+",";
            temp=temp.next;
        }
        ans+=temp.data+"]";

        return ans;
    }
}
