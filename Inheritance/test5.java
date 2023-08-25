class p{
    static void m1(){
        System.out.println("m1 in p class");
    }
}
class q extends p{
    static void m1(){
        System.out.println("m1 in q class");
}
}
public class test5 {
    public static void main(String[]args) {
        p.m1();
        q.m1();
        p p1=new P();
        p1.m1();
        q q1=new Q();
        q1.m1();


    }
    
}
