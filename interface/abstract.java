interface payable{
    void pay();
}
class creditcard implements payable{
    public void pay(){
        System.out.println("paid through credit card");
    }
}
class netbanking implements payable{
    public void pay(){
        System.out.println("paid throgh net banking");
    }    
}
class UPI implements payable{
    public void pay(){
        System.out.println("pay by UPI");
    }
}



