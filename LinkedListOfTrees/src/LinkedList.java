public class LinkedList {
    Node head;
    int size;
    static class Node{
        Tree t;
        Node next;

        public Node(Tree t) {
            this.t = t;
        }
    }

    public void insertHead(Tree t){
        size++;
        Node n=new Node(t);
        n.next=head;
        head=n;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            temp.t.print();
            temp=temp.next;
            System.out.println("|");
        }
        System.out.println("NULL");

    }
}
