package tasksday3;

public class Vehicle {
    private String name;
    private int wheels;

    public Vehicle(){
        System.out.println("Vehicle constructor");
    }

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String toString() {
        return "Name: " + name + ", Wheels: " + wheels;
    }
}
