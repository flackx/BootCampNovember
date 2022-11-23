package tasksday3;

public class Car extends Vehicle {
    private int doors;
    private double engineSize;
    private int maxSpeed;
    private int gears;
    private String gearbox;

    public Car(){
        System.out.println("Car constructor");
    }

    public Car(String name, int wheels, int doors, int engineSize, int maxSpeed, int gears, String gearbox) {
        super(name, wheels);
        this.doors = doors;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
        this.gears = gears;
        this.gearbox = gearbox;
    }

    public int getDoors() {
        return doors;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public void getGears() {
        System.out.println("Gears: "+gears);
    }
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
    public void getGearbox() {
        System.out.println("Gearbox: "+gearbox);
    }

    public String toString() {
        return super.toString() + ", Doors: " + doors + ", Engine Size: " + engineSize + ", Max Speed: " + maxSpeed + ", Gears: " + gears + ", Gearbox: " + gearbox;
    }
}
