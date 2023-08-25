import java.util.*;
class basic{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int a=sc.nextInt();
        int twothosand=a/2000;
        a=a%2000;
        int fivehundred=a/500;
        a=a%500;

        int twohundred=a/200;
        a=a%200;

        int onehungred=a/100;
        a=a%100;

       System.out.println("no. of 2000 note="+twothosand);
       System.out.println("no. of 500 notes="+fivehundred);
       System.out.println("no of 200 notes="+twohundred);
       System.out.println("no of 100 notes="+onehungred);

    }
}