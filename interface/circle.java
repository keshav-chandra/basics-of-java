class circle {
    private int radius;
    public circle(int r){
        radius=r;
        System.out.println("circle object is created");
    }

//getter radius
public int getradius(){
    return radius;
}
//setter for radius
public void setradius(int r){
    radius=r;
    System.out.println("radius updated");

}
}
class test2{
    public static void main(String[]args) {
        circle c1=new circle(10);
        System.out.println(c1.getradius());
       c1.setradius(20);
       System.out.println(c1.getradius());
    }
}
