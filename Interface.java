interface It1{
    void m1();
    void m2();
}
interface It2{
    void m3();
}
abstract class A implements It1,It2{
    public void m1(){

    }
}
abstract class B extends A {
    public void m2(){

    }
}
class C extends B{
    public void m3(){

    }
}
