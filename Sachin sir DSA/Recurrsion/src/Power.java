public class Power {
    static  int call=0;
    public static Long power(int x, int n){
        System.out.println(++call);

        if(n==1)return (long)x;
        if(n==0)return (long)0;
        long p=power(x, n/2);
        if(n%2==0){
            return (long)p*p;
        }else{
            return (long)x*p*p;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,1024));
    }

}
