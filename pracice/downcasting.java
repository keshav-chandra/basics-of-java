// class A{

// }
// class B extends A{

// }
// class c extends A{

// }
// class test1{
//     class downcasting {
//     A a1=new A();
//     a1.m1();
//     //B b1= (B)a1;
    
    
//     }
// }

// example-2
// abstract class Animal{
//     abstract void makesound();
// }
// class Dog extends Animal{
// void makesound(){
//     System.out.println("bow bow");
// }
// void jump(){
//     System.out.println("Dog is jumping");
// }
// }
// class test1{
//     public static void main(String[]args) {
//         Animal a =new Dog();
//         a.makesound();
//         Dog d1=(Dog)a;
//         d1.jump();
//         ((Dog)a).jump();
//     }
// }
    
//example-3
interface Car{
    void start();
    void accelerate();
    void brake();
}
class Audi implements Car{
    public void start(){
        System.out.println("audi starts");
    }
    public void accelerate(){
        System.out.println("Audi accelerate");
    }
    public void brake(){
        System.out.println("audi stoped");
    }
    public void nitro(){
        System.out.println("nitro activated");
    }    
}
class BMW implements Car{
    public void start(){
        System.out.println("audi starts");
    }
    public void accelerate(){
        System.out.println("Audi accelerate");
    }
    public void brake(){
        System.out.println("audi stoped");
    }
    public void gps(){
        System.out.println("gps started");
    }
}
class ferrari implements Car{
    public void start(){
        System.out.println("audi starts");
    }
    public void accelerate(){
        System.out.println("Audi accelerate");
    }
    public void brake(){
        System.out.println("audi stoped");
    }
    public void playmusic(){
        System.out.println("music starts");
    }   
}
