import java.util.*;
public class Car {
    Scanner sc = new Scanner(System.in);
    String carModel, name, owner;
    double price;

    void input() {
        System.out.println("Enter car model: ");
        carModel = sc.nextLine();
        System.out.println("Enter car name: ");
        name = sc.nextLine();
        System.out.println("Enter car price: ");
        price = sc.nextDouble();
        System.out.println("Enter owner name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("The car model is: " + carModel);
        System.out.println("The name of car is: " + name);
        System.out.println("The price of car is: " + price);
        System.out.println("The car owner is: " + owner);
    }
}
class runner {
    public static void main(String[] args) {
                      Car car = new Car();
                      car.input();
                      car.display();
                  }
}

