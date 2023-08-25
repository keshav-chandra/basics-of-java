import java .util.Scanner;
class factory {
    public static payable getobject() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-net banking");
        System.out.println("2-credit card");
        System.out.println("3-UPI");
        System.out.println("select your payment option");
        int option=sc.nextInt();
        if(option==1) return new netbanking();
        if(option==2) return new creditcard();
        if(option==3) return new UPI();
        System.out.println("wrong input");
        return null;
    }
}
