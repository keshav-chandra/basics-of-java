
// class G{
// int i=1;
// void m1(){
// System.out.println("m1() in class G");
// }
// }

// class H extends G{
//     int i=2;
//     void m1(){
// System.out.println("m1() in class H");
//     }
// }
// class test4{
//     public static void main(String[]args) {
//         G g1=new G();
//         System.out.println(g1.i);
        
//         g1=new H();
//         System.out.println(g1.i);
//         g1.m1();
//     }
// }


//CALL BY REFERENCE EXAMPLE
// class A{
//     int i=1;
//     void m1(){

//     }
// }
// class B extends A{
//     int j=2;
//     void m2(){

//     }
// }
// class C extends A{
//     int k=3;
//     void m3(){

//     }
// }
// class test1{
//     public static void main(String[]args) {
//         A a1;
//         a1=new B();
//         System.out.println(a1.i);
//         //System.out.println(a1.j);//CTE
//         a1.m1();
//         //a1.m2();//CTE
//         a1=new C();
//         System.out.println(a1.i);
//         //System.out.println(a1.k);
//         a1.m1();
//        // a1.m3();//CTE
//     }
// }

// class D{
//     void m1(){

//     }
// }
// class  E extends D{
//     void m2(){

//     }
// }
// class F extends E{
//     void m3(){

//     }
// }
// class tets2{
//     public static void main() {
//         D d1=new D();
//         d1.m1();
//         // d1.m2();
//         // d1.m3();

//         E e1=new E();
//         e1.m1();
//         e1.m2();
//        // e1.m3();

//         F f1=new F();
//         f1.m1();
//         f1.m2();
//         f1.m3();


        
//     }
// }

//UPCASTING EXAMPLE 1
// class A{
// }
// class B extends A{
// }
// class C extends B{
// }
// class test1{
//     public static void main(String[] args) {
//         A a1=(A)new B();//Upcasting
//         A a2=new C();//auto UPCASTING
        
//     }
// }


//ex--2
class car{

}

class BMW extends car{

}
class AUDI extends car{

}
class Driver{
    void drive(car c){
        System.out.println("drive executed");
    }
}
class Tets4{
public static void main(String[]args){
    AUDI a=new AUDI();
    BMW b=new BMW();
    Driver d=new Driver() ;
    d.drive(b);
    d.drive(a);
}
}

