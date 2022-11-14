import java.util.Scanner;

public class MiddleOfll {
    public static void mid(LinkedList l){
        LinkedList.Node head=l.getHead();
        LinkedList.Node ans=l.getHead();
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        size=(size/2)+1;
        while(size-->=0){
            size--;
            ans=ans.next;
        }
        l.setHead(ans);
        System.out.println(l);
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.insertAtTail(sc.nextInt());
        }
        mid(l);

    }
}
