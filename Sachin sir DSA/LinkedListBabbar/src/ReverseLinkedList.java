import java.util.Scanner;

public class ReverseLinkedList {
    private static void r(LinkedList top,LinkedList.Node head, LinkedList.Node prev){
        if(head==null){
            top.setHead(prev);
            return;
        }
        LinkedList.Node next=head.next;
        r(top, next, head);
        head.next=prev;
    }
    public static void reverseItrative(LinkedList l){
        LinkedList.Node temp=l.getHead();
        LinkedList.Node prev=null;

        while(temp!=null){
            LinkedList.Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        l.setHead(prev);

    }

    private static void reverse(LinkedList l){
        r(l,l.getHead(),null);
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.insertAtTail(sc.nextInt());
        }
        reverse(l);
//        reverseItrative(l);
        System.out.println(l);
    }
}
