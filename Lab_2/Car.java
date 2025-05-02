public class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void display() {
        System.out.println("Car: " + make + " " + model + " (" + year + ") - " + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", (short)2020, 1500000);
        Car car2 = new Car("Toyota", "Corolla", (short)2019, 1400000);

        car1.display();
        car2.display();
    }
}

