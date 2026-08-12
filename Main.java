package module2;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.showModel();
    }
}
