import java .util.*;
class example {
    public static void main(String[]args) {
        System.out.println("enter the year=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // if(n>0){
        //     System.out.println(n+"is a +ve nos.");
        // }
        // else if(n<0){
        //     System.out.println(n+"is -ve nos.");
        // }
        // else{
        //     System.out.println("no. is zero");
        // }

        // if(n%2==0){
        //     System.out.println("no. is even nos");
        // }
        // if(n%2!=0){
        //     System.out.println("no. is odd nos");
        // }

        if((n%400==0) ||(n%4==0 && n%100!=0) ){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not a leap year");
        }
    }
    
}
