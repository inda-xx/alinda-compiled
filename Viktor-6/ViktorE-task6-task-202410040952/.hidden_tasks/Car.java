public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void startCar() {
        System.out.println(model + " starting.");
    }

    public void stopCar() {
        System.out.println(model + " stopping.");
    }
}