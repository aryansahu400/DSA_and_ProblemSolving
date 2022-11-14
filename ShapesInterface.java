import java.util.Scanner;

interface Shape{
    float area();
    float perimeter();
}
class Rectangle implements Shape{
    private float length;
    private float breadth;

    Rectangle(float l, float b){
        length=l;
        breadth=b;
    }

    public void setDimensions(float l, float b){
        length=l;
        breadth=b;
    }
    

    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }

}
class Square implements Shape{
    private float side;
    
    Square(float s){
        side=s;
    }
    public void setDimensions(float l){
        side=l;
    }
    public float area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}

class Circle implements Shape{
    private float radius;

    Circle(float r){
        radius=r;
    }
    public void setDimensions(float r){
        radius =r;
    }
    public float area(){
        return (22/7)*radius*radius;
    }

    public float perimeter(){
        return 2*(22/7)*radius;
    }
}

public class ShapesInterface{
    
    public static void main(String[] args){
        System.out.println("Enter the number of rectangles");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Rectangle rec[]=new Rectangle[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the length and breadth of rectangle number "+(i+1)+": ");
            float l=sc.nextFloat(),b=sc.nextFloat();
            rec[i]=new Rectangle(l,b);
        }
        for(int i=0;i<n;i++){
            System.out.println("The area of Rectangle number "+(i+1)+" is: "+rec[i].area());
            System.out.println("The perimeter of Rectangle number "+(i+1)+" is: "+rec[i].perimeter());
        }
        System.out.println("Enter the number of Circles: ");
        n=sc.nextInt();
        Circle c[]=new Circle[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the radius circle number "+(i+1));
            float temp=sc.nextFloat();
            c[i]=new Circle(temp);            
        }
        for(int i=0;i<n;i++){
            System.out.println("The area of circle number "+(i+1)+"is :"+c[i].area());
            System.out.println("The perimeter of circle number "+(i+1)+"is :"+c[i].perimeter());
        }
    }
}