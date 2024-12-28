public class FleetExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla Model S", 2022, 50);
        tesla.startCar();
        tesla.displayBatteryStatus();
        tesla.recharge();
        tesla.displayBatteryStatus();
        tesla.stopCar();
    }
}