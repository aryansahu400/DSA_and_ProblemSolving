import java.util.HashSet;

public class CycleDetection {

    //using hashMap
    public boolean hasCycle(LinkedList.Node head){// uses O(n) time & O(n) Space
        if(head==null)return false;
        HashSet<LinkedList.Node> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head=head.next;

        }
        return false;
    }

    //floyd cycle detection algorithm
    public static LinkedList.Node floydCycleDetection(LinkedList l){    //uses O(n) Time and O(1) space
        if(l.getHead()==null){
            return null;
        } else if (l.getHead().next==null) {
            return null;
        }
        LinkedList.Node fast=l.getHead();
        LinkedList.Node slow=l.getHead();
        while(fast!=null && slow!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }else{
                return  null;
            }
            slow=slow.next;
            if(fast==slow)return slow;
        }

        return null;
    }

    //give the Node where the cycle begins

    public static LinkedList.Node CycleBeginNode(LinkedList l){
        LinkedList.Node intersection=floydCycleDetection(l);
        LinkedList.Node slow=l.getHead();

        while(slow!=intersection){
            slow=slow.next;
            intersection=intersection.next;
        }
        return slow;
    }
}
