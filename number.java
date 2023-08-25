import java.util.*;
public class number {
    int num;
    boolean isprime(){
        if (num<=1)return false;
for(int i=2;i<=num/2;i++){
if(num%i==0) return false;
}
return true;
    }
    int length(){
        int count=0;
        int n=num;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    boolean isperfect(){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)sum+=i;

        }
        return sum==num;
    }
}
class test3{
public static void main(String[]args) {
    number ibj=new number();
    obj.num=4567;
    System.out.println("isprime?"+obj.isprime);
    System.out.println("length"+obj.length);
    System.out.println("isperfect?"+obj.isperfect);

    
}
}
