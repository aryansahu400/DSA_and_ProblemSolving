import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.Scanner;

public class Queue {
    int size;
    Node rear;
    Node head;
    int capacity=Integer.MAX_VALUE;

    Queue(int capacity){
        this.capacity=capacity;
        head=null;
        rear=head;
    }
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public void enQueue(int data){
        if(size==capacity){
            throw new IndexOutOfBoundsException("for queue of size "+capacity);
        }
        size++;
        if(head==null){
            head=new Node(data);
            rear=head;
            return;

        }
        Node newNode=new Node(data);
        head.next=newNode;
        head=newNode;
    }

    public int deQueue(){
        if(size==0){
            throw new IndexOutOfBoundsException("for queue of size -1");
        }
        size--;
        Node del=rear;
        rear=rear.next;

        return del.data;
    }

    @Override
    public String toString(){
        StringBuilder ans=new StringBuilder("[");
        Node temp=rear;
        while(temp!=null){
            if(temp.next==null){
                ans.append(temp.data);
                break;
            }
            ans.append(temp.data+",");
            temp=temp.next;
        }
        ans.append(']');
        return ans.toString();
    }

}
