
//runtime Polymorphism
class Rectangle{
    float length;
    float breadth;
    
    Rectangle(float l, float b){
        length=l;
        breadth=b;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
}
class Square extends Rectangle{
    Square(int s){
        super(s,s);
    }
    public float perimeter(){
        return 4*length;
    }
}

//compile Time Polymorphism
class Addition{
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
}

public class QuestionTwo{
    public static void main(String[] args){
        Rectangle r=new Rectangle(12.4f,17);
        Square s=new Square(14);
        System.out.println("Method Overriding: ");
        System.out.println(r.perimeter());
        System.out.println(s.perimeter());
        System.out.println("Method Overloading: ");
        System.out.println(Addition.add(10,10));
        System.out.println(Addition.add(10,10,10));
    }
}