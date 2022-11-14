// https://leetcode.com/problems/reverse-linked-list/

import java.util.Scanner;

public class ReverseLL {
    public static LinkedList.Node reverseRec(LinkedList.Node head, LinkedList.Node prev){
        if(head==null){
            return prev;
        }
        LinkedList.Node temp=head.next;
        head.next=prev;
        return reverseRec(temp,head);
    }
    public static void reverse(LinkedList l){
        LinkedList.Node head=l.getHead();
        int size=l.size();
        LinkedList.Node temp=head;
        LinkedList.Node prev=null;
        l.setTail(head);
        while(temp!=null){
            LinkedList.Node n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        l.setHead(prev);

    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        CircularLL cl=new CircularLL();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            l.insertAtTail(temp);
            cl.insertAtTail(temp);
        }
        l.setHead(reverseRec(l.getHead(),null));
        System.out.println(l);
    }
}
