class Aa{
    static{
        System.out.println("static block in A");
    }
}
class Bb{
    static{
        System.out.println("static block in B");
    }
}
 class test6 {
    public static void main(String []args) {
        new Bb();
        new Aa();
    }
}
