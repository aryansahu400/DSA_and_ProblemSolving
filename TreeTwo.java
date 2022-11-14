class Tree{
    Node head;
    static class Node{
        private int data;
        private Node left;
        private Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static Node createTree(int[] arr, int i){
            if(arr[i]==-1)return null;
            Node n=new Node(arr[i]);i++;
            n.left=createTree(arr,i);
            n.right=createTree(arr,i);
            return n;
        }
        public static void print(Node head){
            if(head==null)return;
            System.out.print(head.data+" ");
            print(head.left);
            print(head.right);
        }
    }

    public void createTree(int[] arr){
        head=Node.createTree(arr,arr.length);
    }
    public void print(){
        Node.print(head);
    }
}
public class TreeTwo{
    public static void main(String[] args){
        Tree t=new Tree();
        int[] arr={2,3,4,-1,-1,5,-1,-1,6,10,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1};
        t.createTree(arr);
        t.print();
    }
}

