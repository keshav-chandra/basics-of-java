import java.util.*;
public class neon {
    public static void main(String[]args) {
        System.out.print("enter the value of the nos");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();     
        int sum=0;
        int num=n;
        int sq=n*n;
        
        while(sq>0){
        int d= sq % 10;
        sum = sum + d;
        sq/=10;
           }
        if(sum==num){
         System.out.println("no is neon nos");
        }
        else{
            System.out.println("not a neon nos");
        }
   
}
 }