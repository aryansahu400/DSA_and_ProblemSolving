import java.util.Scanner;

public class ReverseInKGroup {
    private static LinkedList.Node reverse(LinkedList.Node head, int k){
        if(head==null){
            return null;
        }
        int count=0;
        LinkedList.Node next=head.next;
        LinkedList.Node temp=head;
        LinkedList.Node prev=null;
        while(count<k && temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            count++;
        }
        if(next!=null)head.next=reverse(next, k);
        return prev;
    }
    public static void reverse(LinkedList l, int k){
        l.setHead(reverse(l.getHead(),k));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0;i<n;i++){
            l.insertAtTail(sc.nextInt());
        }

        reverse(l,k
        );
        System.out.println(l);
    }
}
