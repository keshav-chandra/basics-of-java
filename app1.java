import java.util.Scanner;
public class app1 {
    public static void main(String[]args) {
        circle c1,c2;
        c1=new circle();
        c1.radius=10;
        c2=c1;
        System.out.println(c2.radius);
        c2.radius=25;
        System.out.println(c1.radius);
    }
}
