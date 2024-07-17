package Oops;

public class Client {
    public static void main(String []args){
        Car car1 = new Car();
        car1.color="black";
        car1.power=2000;
        car1.company="Mahindra";

        car1.drive(car1.company);
        car1.brake();

    }
}
