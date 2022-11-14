//class Node{
//    int data;
//    Node right;
//    Node left;
//
//    Node(int data){
//        this.data=data;
//        this.right=null;
//        this.left=null;
//    }
//    static int i=-1;
//    public static Node createTree(int[] arr){
//        i++;
//        if(arr[i]==-1) {return null;}
//        Node r=new Node(arr[i]);
//        r.left=createTree(arr);
//        r.right=createTree(arr);
//        return r;
//    }
//    public static void display(Node root){
//        if(root==null) return ;
//        System.out.println(root.data);
//        display(root.left);
//        display(root.right);
//    }
//
//    public static int height(Node root){
//        if(root==null)return 0;
//        return Integer.max(height(root.left),height(root.right))+1;
//    }
//
//    public static int size(Node root) {
//        return 0;
//    }
//}
//
//public class TreeTTTTT {
//    private Node root;
//    private int size;
//
//    public int size() {
//        size=Node.size(root);
//        return size();
//    }
//
//    Tree(){root=null;}
//
//    public void createTree(int arr[]){
//
//        root=Node.createTree(arr);
//    }
//
//    public void display(){
//        Node.display(root);
//    }
//
//    public int height(){return Node.height(root);}
//
//}
