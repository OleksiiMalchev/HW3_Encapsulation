public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private static void startElectricity() {
        System.out.println("Start Electricity is done");
    }

    private static void startCommand() {
        System.out.println("Start tCommand is done");
    }

    private static void startFuelSystem() {
        System.out.println("Start Fuel System is done");
    }
}
