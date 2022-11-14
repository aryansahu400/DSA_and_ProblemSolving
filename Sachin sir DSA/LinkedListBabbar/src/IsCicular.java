public class IsCicular {
    public static boolean isCircular(LinkedList.Node head){
        if(head==null){
            return true;
        }
        LinkedList.Node temp=head;
        while(temp.next!=null){
            if(temp.next==head){
                return true;
            }
            temp=temp.next;
        }
        return false;

    }
    public static boolean isCircular(CircularLL.Node head){
        if(head==null){
            return true;
        }
        CircularLL.Node temp=head;
        while(temp.next!=null){
            if(temp.next==head){
                return true;
            }
            temp=temp.next;
        }
        return false;

    }
}
