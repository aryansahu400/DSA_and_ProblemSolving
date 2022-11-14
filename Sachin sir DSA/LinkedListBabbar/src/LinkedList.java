public class LinkedList {
    Node head;
    private Node tail;
    private int size;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        @Override
        public String toString(){
            String res="[";
            Node temp=this;
            if(temp==null){
                return "[]";
            }

            while(temp!=null){
                res+=temp.data;
                if(temp.next==null)break;
                res+=",";
                temp=temp.next;
            }
            res+="]";

            return res;
        }

    }

    public Node getHead() {
        return head;
    }

    public void insertAtHead(int data){ //O(1)
        size++;
        Node newNode=new Node(data);
        if(head==null){                 //id head id already empty toh new nOde hi head hai
            head=newNode;
            tail=head;
            return;
        }            // varna new node ke aage head laga do or uske baad new node ko head bana do

        newNode.next=head;
        head=newNode;

    }
    public void insertAtTail(int data){
        size++;
        Node t=new Node(data);
        if(head==null){
            head=t;
            tail=head;
            return;
        }

        tail.next=t;
        tail=t;
    }
    public void add(int data){ //O(N) is the time complexity of this function

        if(head==null){         //base case: if the list is empty, happens when head is null
            head=new Node(data);
            tail=head;
            size++;
            return;
        }
        //else use a iterator to iterate at the last pos of the list
        Node iteratorNode=head;
        while(iteratorNode.next!=null){
            iteratorNode=iteratorNode.next;
        }
        Node newNode=new Node(data);
        iteratorNode.next=newNode;
        tail=newNode;
        size++;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(int index, int data){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+size);
        }
        if(index==0){           //the person is wanting to insert at head
            insertAtHead(data);
            return;
        }
        index--;
        if(index==size-1){
            insertAtTail(data);
            return;
        }
        Node iteratorNode=head;
        for(int i=1;i<=index;i++){
            iteratorNode=iteratorNode.next;
        }

        Node newNode=new Node(data);
        newNode.next=iteratorNode.next;
        iteratorNode.next=newNode;
        size++;

    }

    public int size() {
        return size;
    }

    public void deleteAtHead(){
        head=head.next;
        size--;
    }

    public void deleteAtTail(){
        if(tail==head){
            head=null;
            tail=null;
            size--;
        }
        Node iteratorNode=head;
        Node prev=null;
        while(iteratorNode.next!=null){
            prev=iteratorNode;
            iteratorNode=iteratorNode.next;
        }
        tail=prev;
        tail.next=null;
        iteratorNode=null;
        size--;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void delete(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+size);
        }
        if(index==0){
            deleteAtHead();
            return;
        }
        if(index==size-1){
            deleteAtTail();
            return;
        }
        index--;
        Node iteratorNode=head;
        Node prev=null;
        while(index!=-1){
            prev=iteratorNode;
            iteratorNode=iteratorNode.next;
            index--;
        }
        prev.next=iteratorNode.next;
        iteratorNode.next=null;

        size--;
    }
    @Override
    public String toString(){
        String res="[";
        Node temp=this.head;
        if(temp==null){
            return "[]";
        }

        while(temp!=null){
            res+=temp.data;
            if(temp.next==null)break;
            res+=",";
            temp=temp.next;
        }
        res+="]";

        return res;
    }






}
