// class Pra{
//     public void call(long pn) {
//         System.out.println("call connected using 3g network");
//     }
// }
// class smartphone extends Pra{
//     public void call(long p){
//         System.out.println("call is connected using 5g network");
//     }

// }
// class test2{
//     public static void main(String[]rgs) {
//         smartphone sp=new smartphone();
//         sp.call(76217364);
//     }
// }

// class A{
//     void m1(){
// System.out.println("m1 in A");
//     }
// }
// class B extends A{
//     void m1(){
//         System.out.println("m1 in b");
//     }
// }
// class C extends B{

// }
// class test2{
//     public static void main(String []args) {
//         B b1=new B();
//         b1.m1();

//         C c1=new C();
//         c1.m1();
        
//         A a1=new A();
//         a1.m1();
//     }
// }

// overridding
// class animal{
//     void move(){
// System.out.println("running");
//     }
// }
// class snake extends animal{
//     @Override
// void move(){
//     System.out.println("crawling");
// }
// }
// class test2{
//     public static void main(String[]args) {
//         snake s=new snake();
//         s.move();
        
//     }
// }

//example 4
class car{
  void deployairbags(){
System.out.println("air bags are deployed");
    }
}
class bmw extends car{
   final void deployairbags(){
        System.out.println("new imple of airbags deployment");
    }
}
class test2{
    public static void main(String[]args) {
        bmw b1=new bmw();
        b1.deployairbags();
    }
}