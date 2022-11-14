public class FinalValueOfVariable {
    private static int cal(String[] arr){
        int res=0;
        for(String s: arr){
            if(s.charAt(1)=='+')res++;
            else res--;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] arr={"--X","X++","++x"};
        System.out.println(cal(arr));
    }

}
