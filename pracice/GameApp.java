
class GameApp {
public static void main(String[]args) {
    System.out.println("welcome");
    Car car=Carselector.getcar();
    car.start();
    car.accelerate();
    car.brake();
    if(car instanceof Audi)((Audi)car).nitro();
    if(car instanceof BMW)((BMW)car).gps();
    if(car instanceof ferrari)((ferrari)car).playmusic();
    
}    
}
