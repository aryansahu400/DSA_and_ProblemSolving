import java.util.Scanner;

public class Palindrome {
    public static LinkedList.Node reverse(LinkedList.Node temp){
        LinkedList.Node prev=null;

        while(temp!=null){
            LinkedList.Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public static boolean isPalindrome(LinkedList l, int mid){

        LinkedList.Node m=l.getHead();
        for(int i=0;i<mid;i++){
            m=m.next;
        }
        m=reverse(m);
        LinkedList.Node temp=l.getHead();
        while(m!=null){
            if(m.data != temp.data){
                return false;
            }
            m=m.next;
            temp=temp.next;
        }
        return true;
    }
    private static int size(LinkedList l){
        LinkedList.Node head=l.getHead();
        int s=0;
        while(head!=null){
            s++;
            head=head.next;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList l =new LinkedList();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int size=size(l);
        int mid=size/2;
        if(size%2==1)mid++;
        if(isPalindrome(l,mid)){
            System.out.println("The given linkedlist is a panlindrome");
        }else{
            System.out.println("The given linkedlist is not a panlindrome");
        }
    }
}
