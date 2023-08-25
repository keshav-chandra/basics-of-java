import java.util.Scanner;
class armstrongnoswithinrange {
    public static void method(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        int l=sc.nextInt();
        int u=sc.nextInt();
        for(int i=1;i<=u;i++)
        {
            int count=0;
            int temp=i;
            while(temp>0)
            {
                count++;
                temp/=10;

            }
            temp=i;
            int sum=i;
            while(temp>0){
                int d=temp%10;
                int fact=1;
                for(int j=1;j<=count;j++){
                    fact*=d;
                }
                if(i==sum){
                    System.out.println(i);
                    sum=0;
                }
            }
        }
    }
}
