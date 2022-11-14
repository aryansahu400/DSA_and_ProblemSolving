import java.util.Scanner;
public class SquareOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int breadth = sc.nextInt();
		int length = sc.nextInt();
		if(breadth == length)
		{	
			System.out.println("this rectangle is a square");
		}else{
			System.out.println("this rectangle is not a square");
		}
	}
}