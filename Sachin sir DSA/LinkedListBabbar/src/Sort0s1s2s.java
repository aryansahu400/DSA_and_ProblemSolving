import java.util.Scanner;

public class Sort0s1s2s {
    private static void sort(LinkedList.Node head){
        int one=0;
        int two=0;
        int zero=0;
        LinkedList.Node temp=head;
        while(temp!=null){
            if(temp.data==0)zero++;
            else if(temp.data==1)one++;
            else two++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=zero;i++){
            temp.data=0;
            temp=temp.next;
        }
        for(int i=1;i<=one;i++){
            temp.data=1;
            temp=temp.next;
        }
        for(int i=1;i<=two;i++){
            temp.data=2;
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for (int i=0;i<n;i++) {
            l.add(sc.nextInt());
        }
        sort(l.getHead());
        System.out.println(l);
    }

}
