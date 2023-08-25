// import java.util.*;
// class b{

// }
// class c{
//     c(int i){

//     }
// }
// class test{
//     public static void main(String[]args) {
//         new b();
//         // new b(10);
//         // new c();
      

//     }
// }
 
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println("length="+this.length);
        System.out.println("breadth="+this.breadth);
    }
}
class test{
    public static void main(String[]args) {
        Rectangle r1=new Rectangle(3,5);
        Rectangle r2=new Rectangle(5,5);
        r1.display();
        r2.display();
    }
}