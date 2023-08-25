import java.sql.Driver;

class car{
    private int num;
    private static int n=1000;
    car(){
        num=n++;
    }
    void start(){
        System.out.println(num+"car start");
    }
    void accelerate(){
        System.out.println(num+"car accelerate");
    }
    void brake(){
        System.out.println(num+"car stops");
    }
}
class driver{
    private car c;
     driver(car c){
        this.c=c;
    }
    public void drive(){
        c.start();
        c.accelerate();
        c.brake();
    }
}
class aggregation {
    public static void main(String[]args) {
        driver d1=new driver(new car());
        d1.drive();
        driver d2=new driver(new car());
        d2.drive();
    }
}
