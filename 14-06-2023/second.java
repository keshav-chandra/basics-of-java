import java.util.*;
public class second {
    public static void main(String[]args) {
        System.out.println("enter the num");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev= rev *10+d;
            n/=10;
        }
  if (rev==sum){
    System.out.println("is a palindrome");
  }
else{
    System.out.println("not a palindrome");
}
    }
}
