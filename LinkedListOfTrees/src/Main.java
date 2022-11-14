import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of tree: ");
//        int nt=sc.nextInt();
//
//        for (int i = 1; i <= nt; i++) {
//            System.out.println("Enter the nodes of first Tree: ");
//            int n= sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++){
//
//            }
//        }






        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t1=new Tree();
        t1.createTree(arr);
        arr= new int[]{2, 3, 4, -1, -1, 5, -1, -1, 3, -1, 6, 8, -1, -1, 7, -1, -1};
        Tree t2=new Tree();
        t2.createTree(arr);
        arr= new int[]{3, 3, 4, -1, -1, 5, -1, -1, 3, -1, 6, 8, -1, -1, 7, -1, -1};
        Tree t3=new Tree();
        t3.createTree(arr);

        LinkedList l=new LinkedList();
        l.insertHead(t3);
        l.insertHead(t2);
        l.insertHead(t1);

        l.print();
    }
}
