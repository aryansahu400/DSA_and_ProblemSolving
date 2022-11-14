import java.util.Scanner;

public class MergeSort {
    public static LinkedList.Node merge(LinkedList.Node a, LinkedList.Node b){
        if(a==null){
            return b;
        }else if(b==null){
            return a;
        }
        LinkedList.Node head =new LinkedList.Node(-1);
        LinkedList.Node temp=head;
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.data=a.data;
                if(a.next!=null) {
                    temp.next = new LinkedList.Node(-1);
                    temp = temp.next;
                }
                a=a.next;
            }else {
                temp.data=b.data;
                if(b.next!=null) {
                    temp.next = new LinkedList.Node(-1);
                    temp = temp.next;
                }
                b=b.next;
            }
        }
        if(a!=null){
            temp.next=new LinkedList.Node(-1);
            temp=temp.next;
        }
        while(a!=null){
            temp.data=a.data;
            if(a.next!=null) {
                temp.next = new LinkedList.Node(-1);
                temp = temp.next;
            }
            a=a.next;
        }
        if(b!=null){
            temp.next=new LinkedList.Node(-1);
            temp=temp.next;
        }
        while(b!=null) {
            temp.data=b.data;
            if(b.next!=null){
                temp.next=new LinkedList.Node(-1);
                temp=temp.next;
            }
            b=b.next;
        }
        return head;
    }
    private static LinkedList.Node divide(LinkedList.Node head){
        if(head==null || head.next==null){
            return head;
        }
        LinkedList.Node mid=findMid(head);
        LinkedList.Node left=head;
        LinkedList.Node right=mid.next;
        mid.next=null;

        left=divide(head);
        right=divide(right);

        return merge(left,right );
    }
    private static LinkedList.Node findMid(LinkedList.Node head){
        if(head==null || head.next==null){
            return head;
        }
        LinkedList.Node slow=head;
        LinkedList.Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                if(fast==null)return slow;
            }else{
                return slow;
            }
            slow = slow.next;

        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        l.setHead(divide(l.getHead()));
        System.out.println(l);
    }


}
