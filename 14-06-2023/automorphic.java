import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        System.out.println("enter the num");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int n=num;
        int d=1;
       while(n>0){
          d=d*10;
          n/=10;
       }
        int sq=num*num;
        if(sq%d == num){
            System.out.println("no.is automorphic nos");
        }
        else{
            System.out.println("not an automorphic nos");
        }
    }
}
