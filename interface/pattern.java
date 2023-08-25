 import java .util.Scanner;
class pattern {
    public static void main(String[]args) {
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                int k=((i-1)*n)+1;
            for(int j=1;j<=n;j++){          
                    System.out.print(k+" ");
                    k++;
                }
            }
            else{
               int k=i*n;
                for(int j=1;j<=n;j++){
                    System.out.print(k+" ");
                    k--;
                }
            }
            System.out.println();
        }
    }
        }
    

