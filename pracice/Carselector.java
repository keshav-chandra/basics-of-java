import java.util.Scanner;
class Carselector {
    public static Car getcar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Audi");
        System.out.println("2-BMW");
        System.out.println("3-ferrari");
        System.out.println("please start car");
        int o=sc.nextInt();
        if(o==1)return new Audi();
        if(o==2)return new BMW();
        if(o==3)return new ferrari();
        System.out.println("wrong mismatch");
        return null;
        
    }
}
