package tasksday3;

public class bmw extends Car {
    public static void main(String[] args) {
        bmw e46 = new bmw();
        e46.setName("BMW E46");
        e46.setWheels(4);
        e46.setDoors(4);
        e46.setEngineSize(3.0);
        e46.setSpeed(50);
        e46.setGears(5);
        e46.setGearbox("Manual");
        e46.setGearUsed();
        System.out.println(e46);

        bmw e90 = new bmw();
        e90.setName("BMW E90");
        e90.setWheels(4);
        e90.setDoors(4);
        e90.setEngineSize(2.0);
        e90.setSpeed(0);
        e90.setGears(6);
        e90.setGearbox("Manual");
        e90.setGearUsed();
        e90.getGearUsed();

    }
}
