import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeFromSorted(LinkedList l){
        LinkedList.Node temp=l.getHead();
        while(temp!=null){
            if(temp.next!=null){
                if(temp.data==temp.next.data){
                    LinkedList.Node toDel=temp.next;

                    temp.next=temp.next.next;
                    toDel.next=null;
                    l.setSize(l.size()-1);
                }else{
                    temp=temp.next;
                }
            }else{
                temp=temp.next;
            }

        }
    }
    public static void removeFromUnsorted(LinkedList l){
        LinkedList.Node temp=l.getHead();
        HashSet<Integer> set=new HashSet<>();
        while(temp!=null){
            set.add(temp.data);
            if(temp.next!=null) {
                if (set.contains(temp.next.data)) {
                    LinkedList.Node toDel=temp.next;
                    temp.next=temp.next.next;
                    toDel.next=null;
                    l.setSize(l.size()-1);
                }else{
                    temp=temp.next;
                }
            }
            else {
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList unsorted=new LinkedList();
        for(int i=0;i<n;i++){
            unsorted.add(sc.nextInt());
        }
        removeFromUnsorted(unsorted);
        System.out.println(unsorted);
    }
}
