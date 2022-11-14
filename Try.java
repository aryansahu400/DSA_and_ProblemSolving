


import java.util.Scanner;


class R1 extends Thread{
    public void run(){
    
    }
    public int r1(int l, int u){
        int result=l;
        for(int i=l,j=1;i<=u;i++){
            j++;
            if(j==1312323213)return i;
            if(i%7==0){
                i+=u-7;
            }
            if(i==u){
                i=l;
            }
            result=i;
        }
        return result; 
        
    }
}
public class Try{
    public static int generateRandom(int l, int u){
        int result=l;
        R1 one = new R1();
        one.start();
        for(int i=0;i<l+u;i++){
            result=one.r1(l,u);
            if(i==(l+u)/3){
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(generateRandom(sc.nextInt(),sc.nextInt()));
    }
}
