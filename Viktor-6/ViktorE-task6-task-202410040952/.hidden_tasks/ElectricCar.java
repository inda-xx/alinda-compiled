public class ElectricCar extends Car {
    int batteryLevel;

    public ElectricCar(String model, int year, int batteryLevel) {
        super(model, year);
        this.batteryLevel = batteryLevel;
    }

    public void recharge() {
        System.out.println(model + " recharging...");
        batteryLevel = 100;
    }

    public void displayBatteryStatus() {
        System.out.println(model + " battery level: " + batteryLevel + "%");
    }
}