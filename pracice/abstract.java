// bad combinations
// abstract class A{
//     private abstract void m1();
//     static abstract void m2();
//     final abstract void m3();
// }

// automatically it call to super
// abstract class  A{
//     A(){
//         System.out.println("constructor in class A");
//     }
// }
// class B extends A{
//     B(){
//         System.out.println("constructor in class B");
//     }
// }

//     class test2{
//     public static void main(String []args){
//         new B();
//     }
// }


abstract class shape{
    String color;
    shape (String c){
        color=c;

    }
    abstract void display();
    abstract double getarea();
}
class circle extends shape{
    int radius;
    circle(String c,int r){
        super(c);
        radius=r;
    }
    void display(){
        System.out.println("circle=[color="+color+",radius="+radius+"]");
    }
    double getarea(){
        return 3.14*radius*radius;
    }
}
class rectangle extends shape{
    int length;
    int breadth;
    rectangle(String c,int l,int b){
        super(c);
        length=l;
        breadth=b;
    }
    void display(){
        System.out.println("reactangle[color="+color+",length="+length+",breadth="+breadth+"]");
    }
    double getarea(){
        return length*breadth;
    }
}
class test4{
    public static void main(String[]args) {
        shape s;
        s=new circle("blue",7);
        s.display();
        System.out.println("area"+s.getarea());
        
    }
}