/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Book{
    String title;
    String author;
    Double price;
    
    Book(String t,String a,Double p){
        title=t;
        author=a;
        price=p;
    }
    void display(){
        System.out.println("Book[title="+title+",author="+author+",price="+price+"]");
    }
}
class Bookcreator{
    static Book create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("title=");
        String t=sc.nextLine();
        System.out.println("author=");
         String a=sc.nextLine();
        System.out.println("price=");
         Double p=sc.nextDouble();
         return new Book (t,a,p);
    }
}
class App{
    public static void main(String[]args){
        Book b1=Bookcreator.create();
        Book b2=Bookcreator.create();
        b1.display();
        b2.display();
    }
}