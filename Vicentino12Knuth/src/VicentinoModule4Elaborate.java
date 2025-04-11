public class VicentinoModule4Elaborate {

    static class Car {
        private String brand;
        private String model;

        public Car() {
            this.brand = "Toyota";
            this.model = "Corolla";
        }

        public Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Car(Car otherCar) {
            this.brand = otherCar.brand;
            this.model = otherCar.model;
        }

        public void displayCar() {
            System.out.println("Car Brand: " + brand);
            System.out.println("Car Model: " + model);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Car 1 (Default Constructor):");
        car1.displayCar();

        Car car2 = new Car("Honda", "Civic");
        System.out.println("\nCar 2 (Parameterized Constructor):");
        car2.displayCar();

        Car car3 = new Car(car2);
        System.out.println("\nCar 3 (Copy Constructor):");
        car3.displayCar();
    }
}
