class phone{
    void call(){
        System.out.println("call connected");
    }
}
class cameraphone extends phone{
    void takephoto(){
        System.out.println("photo captured");
    }
}
class smartphone extends cameraphone{
    void installApp(){
        System.out.println("App is installed");
    }
}

class test4{
    public static void main(String[]args) {
        phone p=new phone();
        p.call();
        System.out.println("______");
        cameraphone cp=new cameraphone();
        cp.takephoto();
        System.out.println("______");
        smartphone sp=new smartphone();
        sp.call();
        sp.takephoto();
        sp.installApp();
    }
}