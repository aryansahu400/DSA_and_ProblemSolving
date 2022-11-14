class List{
    Node head=new Node();
    int size=0;
    
    public void insert(int data){
        Node n=new Node(data);
        if(size==0){
            head.data=n.data;
            head.next=null;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        size++;
    }
    public void insertAtHead(int data){
        Node n=new Node(data);
        if(size==0){
            head.data=n.data;
            head.next=null;
            size++;
            return;
        }
        n.next=head;
        head=n;
        size++;
    }
    public void print(){
        if(size==0){
            System.out.println("List is empty");
        }
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
    public void deleteAt(int number){
        if(number==1){
            head=head.next;
            size--;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        if(number==size){
            for(int i=0;i<number-1;i++){
                secondLast=secondLast.next;
            }
            secondLast.next=null;
            size--;
            return;
        }
        for(int i=0;i<number-1;i++){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=last.next;
        size--;
    }
    public int size(){
        return this.size;
    }
}
class Node{
    public int data;
    public Node next;
    Node(){}
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class Main{
    public static void main(String[] args){
        List l1=new List();
        l1.insert(10);
        l1.insert(20);
        l1.insert(233);
        l1.insertAtHead(987);
        l1.insertAtHead(7);
        // l1.deleteAt(1);
        l1.insert(20);
        // l1.deleteAt(4);
        
        l1.print();
    }
    
}