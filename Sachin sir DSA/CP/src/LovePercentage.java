import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class LovePercentage {
    private static int count(char temp,ArrayList<Character> al, boolean[] visited){
        int count=0;
        for(int i=0;i< al.size();i++){
            if(visited[i]==false && al.get(i)==temp){
                count++;
                visited[i]=true;
            }
        }

        return count;
    }

    private static ArrayList<Integer> cal(ArrayList<Integer> al){

        if(al.size()==2){
            return al;
        }
//        System.out.println(al);
        ArrayList<Integer> temp=new ArrayList<>();
        int i=0;
        int j=al.size()-1;
        while(true){
            if(j<i)break;
            if(i==j){
                int t=al.get(i);
                if(t>9){
                    String s=t+"";
                    for(int index=0;index<s.length();index++){
                        temp.add(Integer.parseInt(s.charAt(index)+""));
                    }
                }else {
                    temp.add(t);
                }
                i++;
                j--;
                continue;
            }

            int t=al.get(i)+al.get(j);
            if(t>9){
                String s=t+"";
                for(int index=0;index<s.length();index++){
                    temp.add(Integer.parseInt(s.charAt(index)+""));
                }
            }else {
                temp.add(t);
            }
            i++;
            j--;

        }
        return cal(temp);

    }
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a=bf.readLine();
        String b=bf.readLine();
        HashMap<Character, Integer> h=new HashMap<>();
        a=a.trim();
        b=b.trim();
        a=a.toLowerCase();
        b=b.toLowerCase();
        ArrayList<Character> in=new ArrayList<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ')continue;
            in.add(a.charAt(i));
        }
        String l="loves";
        for (int i=0;i<l.length();i++) {
            in.add(l.charAt(i));
        }
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)==' ')continue;
            in.add(b.charAt(i));
        }
        ArrayList<Integer> al=new ArrayList<>();
        boolean[] visited=new boolean[in.size()];
        for(int i=0;i< in.size();i++){
            char temp=in.get(i);
            int c=count(temp,in,visited);
            if(c>0){
                al.add(c);
            }
        }
        al=(cal(al));
        System.out.println(al.get(0)+""+al.get(1)+"%");
    }
}
