import java .util.Scanner;
class Sone{
    public static void main(String[]args) {
        System.out.println("enter yhe number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=a;i<=b;i++){
            if(i<=1)continue;
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
                if (flag)
                {
                    count++;
                    if (count%2!=0)
                    {
                        System.out.println(i);
                    }
                }
            
        }   
            
    }
}
