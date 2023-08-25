 interface sim{
    void connectcall();
 }
 class phone{
    sim s;
    phone(sim s){
        this.s=s;
        System.out.println("phone object is created and sim is inserted");
    }
    void dial(){
        s.connectcall();
        System.out.println("speaking");
    }
 }
 class airtel implements sim{
    public void connectcall(){
        System.out.println("connect is established using airtel network");
    }
 }
 class jio implements sim{
 public void connectcall(){
    System.out.println("connection is established using jio network");
 }
 }
 
 
 class test3 {
    public static void main(String[]args) {
      phone p1=new phone(new airtel());
      p1.dial();
      
      phone p2=new phone(new jio());
      p2.dial();
    }
    
}
