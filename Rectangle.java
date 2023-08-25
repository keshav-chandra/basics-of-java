import java.util.*;
public class Rectangle {
    int length;
    int breadth;
    
    void initialize(int length, int bbreadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("rectangle obj. is initilized");
    }
    void area(){
        System.out.println("area="+(this.length*this.breadth));
    }
    void perimeter(){
        int p=2*(this.length+this.breadth);
        System.out.println("perimetre="+p);
    }
    void displayDimensions(){
        System.out.println("length="+this.length);
System.out.println("breadth="+this.breadth);
    }
    }
   class test2{
    public static void main(String[]args) {
     
       
        r1.initialize(20,40);
        r1.displayDimensions();
        r1.area();
        r1.perimeter();
    }
}
