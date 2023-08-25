import java.util.*;

public class alternateprimenos {
    public static void main(String[]args) {
        System.out.println("enter the nos");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a=sc.nextInt();
         int b=sc.nextInt();
         for(int i=a;i<=b;i++){
        if(n<2){
            System.out.println("no. is not a prime nos");
        }
        for(int k=2;k<=n/2;k++){
            if(k%n==0){
                break;
                }
          System.out.println("no is prime nos");
        }
        }
    }
}

