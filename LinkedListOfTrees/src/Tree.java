public class Tree {
    Node root;
    int size;
    static class Node{
       int data;
       Node left;
       Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static int i=-1;
    private static Node c(int[] arr){
        i++;
        if(arr[i]==-1)return null;
        Node n=new Node(arr[i]);
        n.left=c(arr);
        n.right=c(arr);
        return  n;
    }
    private void p(Node root){
        if(root==null)return;;
        p(root.left);
        System.out.print(root.data+" ");
        p(root.right);

    }
    public void createTree(int[] arr){
        root=c(arr);
        i=-1;
    }
    public void print(){
        p(root);
        System.out.println();

    }

}
