class vehicle{
   // vehicle(){
    //String brand="";
    //int speed=0;
    //}
    String brand;
    int speed;
    vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public void display(){
        System.out.println("brand name of vehicle: " + brand);
        System.out.println("speed of vehicle: "+ speed);
    }

}

 class car extends vehicle{
         String model="2026";
         System.out.println("model name: "+ model);

}
public class internal {
    public static void main(String[] args) {
        vehicle v= new vehicle("AUDI",76);
        car c= new car();
        c.display();

    }
}
