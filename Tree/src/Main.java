public class Main {

    public static void main(String[] args) {
        TreeTwo t1=new TreeTwo();
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        t1.createTree(arr);
        t1.display();

        System.out.println("Size = "+t1.size());
        System.out.println("Height = "+t1.height());
    }
}