import java.util.*;
public class nivennos {
    public static void main(String[]args) {
        System.out.println("enter the nos");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
      while(n>0){
        int d=n%10;
    sum+=d;
    n/=10;
      }
      if(num%sum==0){
System.out.println("it is an niven nos");
      }
      else{
        System.out.println("it is not an niven nos");
      }
    }
}
