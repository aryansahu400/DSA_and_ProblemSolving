@SuppressWarnings("unchecked")
class LinkedList<T>{
    Node head=null;
    
    public void add(T data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    public void add(int index, T data){
        Node n=new Node(data);
        if(index==0){
            n.next=head;
            head=n;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node newNode=temp.next;
        temp.next=n;
        n.next=newNode;
    }
    
    public Object get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void remove(int index){
        if(head==null){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node secondLast=temp;
        int j=0;
        for(int i=0;i<index;i++){
            if(j==0){
                temp=temp.next;
                if(index==1){
                    secondLast.next=temp.next;
                    return;
                }
                j++;
                continue;
            }
            temp=temp.next;
            secondLast=secondLast.next;
        }
        secondLast.next=temp.next;
    }
    
    public void print(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    
}
class Node<T>{
    T data;
    Node next;
    
    Node(T data){
        this.data=data;
        next=null;
    }
}


