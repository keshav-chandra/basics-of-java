class shape{
    String color;
    shape()
    {
}
shape(String c){
    color=c;
}
}
class circle extends shape{
    int radius;
    circle(int r){
        radius=r;
    }

circle(String c,int r){
    super(c);
    radius=r;
}
}
class test54{
    public static void main(String[]args) {
        circle c1=new circle(10);
        System.out.println(c1.color+" "+c1.radius);
        circle c2=new circle("red", 20);
        System.out.println(c2.color+" "+c2.radius);
    }
   
}