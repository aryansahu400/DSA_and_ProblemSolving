import java.util.*;
import java.lang.*;


class Trainer{
    public int n;
    public int water;
    public int ground;
    public int power;




    public Trainer(int n) {
        this.n = n;

    }

    public void powerMeasure(Trainer[] arr){
        int waterP=0;
        int groundP=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){

            if(this.water>arr[i].water){
                waterP++;
                s.add(arr[i].n);
            }
            if(this.ground>arr[i].ground){
                groundP++;
                s.add(arr[i].n);
            }
        }
        this.power=s.size();



    }

}
class Pokemon
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int n=sc.nextInt();
            Trainer[] arr=new Trainer[n];
            for(int i=0;i<n;i++){
                arr[i]=new Trainer(i+1);
                arr[i].water=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr[i].ground=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr[i].powerMeasure(arr);
            }

            int max=0;
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i].power>max){
                    count=1;
                    max=arr[i].power;
                }else if(arr[i].power==max)count++;
            }
            System.out.println(count);
        }
    }
}