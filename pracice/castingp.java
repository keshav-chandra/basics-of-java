import java.net.NetworkInterface;

// class Animal{
//     void makesound(){
//         System.out.println("makesound in animal");
//     }
// }
// class dog extends Animal{
//     void makesound(){
//         System.out.println("bhow bhow");
//     }
// }
// class cat extends Animal{
//     void makesound(){
//         System.out.println("meow meow");
//     }
// }
// class test2{
//     public static void main (String[]args) {
//         Animal a;
//         a=new dog();
//         a.makesound();//late binding

//         a=new cat();
//         a.makesound();//late binding
        
//     }
// }

// class A{
// static void m1(){
//     System.out.println("m1 in A");
// }
// }
// class B extends A{
//     static void m1(){
//         System.out.println("m1 in B");
//     }
// }
// class test2{
//     public static void main(String[]args) {
//         A.m1();
//         B.m1();
//         A a1;
//         a1=new A();
//         a1.m1();//early binding

//         a1=new B();
//         a1.m1();//early binding
//     }
// }


// class car{
//     void start(){}
//     void accelerate(){}
//     void stop(){}
// }
// class audi extends car{
//     void start(){
//         System.out.println("audi starts");
//     }
//     void accelerate(){
// System.out.println("audi accelerate");
//     }
//     void stop(){
// System.out.println("audi stopped");
//     }
// }





// class benz extends car{
//     void start(){
//         System.out.println("benz starts");
//     }
//     void accelerate(){
// System.out.println("benz accelerate");
//     }
//     void stop(){
// System.out.println("benz stopped");
//     }
// }
// class driver{
//     void drive(car c){
//         c.start();
//         c.accelerate();
//         c.stop();
//     }
// }
// class test2{
//     public static void main(String[]args) {
//         driver d=new driver();
//         d.drive(new audi());
//         d.drive(new benz());
//     }
// }/

//27-04-2023 THOUBT
// class A{

// }
// class B extends A{

// }
// class c{
//     void m1( A args){
//         System.out.println("m1(A) in class c");
//     }
//     void m1(B args){
//         System.out.println("m1 (B) in class c");
//     }
// }
// class d extends c{
//     void m1(A args){
//         System.out.println("m1(A) in class d");
//     }
//     void m1(B args){
//         System.out.println("m1(B) in class d");
//     }
// }
// class test3{
//     public static void main(String[]args) {
//         c c1=new d();
//         A a1=new B();
//         c1.m1(a1);
//     }
// }

//ABSTRACT CLASS
//  abstract class c{
//     abstract void m1();
// }
// class test2{
//     public static void main(String[]args) {
        
//     c c1;
//     //new a();cte
//     System.out.println("hello keshav");
        
//     }
// }

//example 2
// abstract class D{
//     void m1(){
//         System.out.println("m1 in D");
//     }
//     abstract void m2();
// }
// class E extends D{
//     void m2(){
//         System.out.println("m2 in E");
//     }
// }
// class test2{
//     public static void main(String[]args) {
//         D d1;
//         d1=new E();
//         d1.m1();
//         d1.m2();
       
        
//     }
// }