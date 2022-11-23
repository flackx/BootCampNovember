package tasksday3;

public class Car extends Vehicle {
    private int doors;
    private double engineSize;
    private int Speed;
    private int gears;
    private String gearbox;
    private int gearUsed;


    public Car() {
        System.out.println("Car constructor");
    }

    public Car(String name, int wheels, int doors, int engineSize, int Speed, int gears, String gearbox, int gearUsed) {
        super(name, wheels);
        this.doors = doors;
        this.engineSize = engineSize;
        this.Speed = Speed;
        this.gears = gears;
        this.gearbox = gearbox;
        this.gearUsed = gearUsed;

    }

    public int getDoors() {
        return doors;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void getGearbox() {
        System.out.println("Gearbox: " + gearbox);
    }

    public void setGearUsed() {
        //For cars with 5 gears, the gear used can be 1, 2, 3, 4, 5
        int[] gear_a = {15, 27, 50, 75, 100};
        //For cars with 6 gears, the gear used can be 1, 2, 3, 4, 5, 6
        int[] gear_b = {15, 27, 40, 55, 70, 100};

        if (gearUsed > gears) {
            System.out.println("Invalid gear");
        }
        if (this.getSpeed() == 0) {
            System.out.println("You are not moving");
            this.gearUsed = 0;
        }
        if (getGears() == 5) {
            if (getSpeed() > 0 && getSpeed() <= gear_a[0]) {
                this.gearUsed = 1;
            } else if (getSpeed() > gear_a[0] && getSpeed() <= gear_a[1]) {
                this.gearUsed = 2;
            } else if (getSpeed() > gear_a[1] && getSpeed() <= gear_a[2]) {
                this.gearUsed = 3;
            } else if (getSpeed() > gear_a[2] && getSpeed() <= gear_a[3]) {
                this.gearUsed = 4;
            } else if (getSpeed() > gear_a[3] && getSpeed() <= gear_a[4]) {
                this.gearUsed = 5;
            }
        }
        if (getGears() == 6) {
            if (getSpeed() > 0 && getSpeed() <= gear_b[0]) {
                gearUsed = 1;
            } else if (getSpeed() > gear_b[0] && getSpeed() <= gear_b[1]) {
                gearUsed = 2;
            } else if (this.getSpeed() > gear_b[1] && getSpeed() <= gear_b[2]) {
                gearUsed = 3;
            } else if (this.getSpeed() > gear_b[2] && getSpeed() <= gear_b[3]) {
                gearUsed = 4;
            } else if (getSpeed() > gear_b[3] && getSpeed() <= gear_b[4]) {
                gearUsed = 5;
            } else if (getSpeed() > gear_b[4] && getSpeed() <= gear_b[5]) {
                gearUsed = 6;
            }
        }

    }

    public void getGearUsed() {
        System.out.println("Gear used: " + gearUsed);
    }

    public String toString() {
        return super.toString() + ", Doors: " + doors + ", Engine Size: "
                + engineSize + ", Speed: " + Speed + ", Gears: " + gears + ", Gearbox: " + gearbox + ", Gear Used: " + gearUsed;
    }
}
