import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Q{
    Node front;
    Node rear;
    int size;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public void add(int data){
        size++;
        if(rear==null){
            rear=new Node(data);
            front=rear;
        }
        Node newNode=new Node(data);
        front.next=newNode;
        front=newNode;
    }
    public int remove(){
        if(front==null){
            return -1;
        }
        int t=rear.data;
        rear=rear.next;
        return t;
    }
}
public class PrimeList {
    public static boolean isPrime(long n){
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        ArrayList<Long> ans=new ArrayList<>((int)(r-l));
        int size=0;
        for(long i=l;i<=r;i++){
            if(isPrime(i)){
                size++;
                ans.add(i);
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
