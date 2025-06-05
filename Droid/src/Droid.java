public class Droid {
    double batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println(name + ": " + "My battery level is: " + batteryLevel);
    }

    public void addEnergy(double energyToAdd) {
        batteryLevel += energyToAdd;
        System.out.println(name + ": " + energyToAdd + " is added to my battery.");
    }

    public void decreaseBattery(double energyToDecrease) {
        batteryLevel -= energyToDecrease;
        System.out.println(name + ": " + energyToDecrease + " is decreased to my battery.");
    }

    public void transferBattery(double batteryToTransfer, Droid droidInstance) {
        batteryLevel -= batteryToTransfer;
        droidInstance.addEnergy((batteryToTransfer));
        System.out.println("The new battery is added to the droid: " + droidInstance.name);
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid said = new Droid("Said");
        codey.transferBattery(30, said);
        codey.energyReport();
    }
}