import java.util.Random;
import java.util.Scanner;

public class MergreTwoSortedLists {
    public static LinkedList.Node merge(LinkedList x, LinkedList y){
        if(x.getHead()==null){
            return y.getHead();
        }else if(y.getHead()==null){
            return x.getHead();
        }
        LinkedList.Node a=x.getHead();
        LinkedList.Node b=y.getHead();
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




    private static LinkedList.Node logic2(LinkedList.Node a, LinkedList.Node b){
        if(a==null){
            return b;

        }else if(b==null){
            return a;
        }

        LinkedList.Node head=new LinkedList.Node(-1);
        LinkedList.Node temp=head;
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.next=a;
                a=a.next;
                temp=temp.next;
            }else{
                temp.next=b;
                b=b.next;
                temp=temp.next;
            }
        }
        if(a!=null){
            temp.next=a;
            a=a.next;
            temp=temp.next;
        }
        if(b!=null){
            temp.next=b;
            b=b.next;
            temp=temp.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        LinkedList a=new LinkedList();
        LinkedList b=new LinkedList();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        LinkedList ans=new LinkedList();
        ans.setHead(logic2(a.getHead(),b.getHead()));
        System.out.println(ans);
    }
}
