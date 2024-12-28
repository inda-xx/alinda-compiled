public class CarStatus {
    public static void main(String[] args) {
        int batteryLevel = 15; // Example battery level
        String status = (batteryLevel <= 20) ? "Recharge Needed" : "Battery Sufficient";
        System.out.println("Car Status: " + status);
    }
}