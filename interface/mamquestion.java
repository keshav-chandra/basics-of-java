import java.util.Scanner;
class mamquestion {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        
        // for(int i=1;i<=n;i++){
        //     int alphabet=65;
        //     for(int j=1;j<=n;j++){
        //         if(i%2!=0)
        //         System.out.print(j);
        //         else
        //         {           
        //             System.out.print((char)alphabet);
        //             alphabet++;
        //         }
        //     }
        //     System.out.println();
        // }
        int k=1;
        int alphabet=65;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(i%2!=0){
                System.out.print(k++);
               
            }
                else
                {           
                    System.out.print((char)alphabet);
                    alphabet++;
                }
            }
            System.out.println();
        }
    }
}
