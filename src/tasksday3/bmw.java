package tasksday3;

public class bmw extends Car {
    public static void main(String[] args) {
        bmw e46 = new bmw();
        e46.setName("BMW E46");
        e46.setWheels(4);
        e46.setDoors(4);
        e46.setEngineSize(3.0);
        e46.setSpeed(50);
        e46.setGears(6);
        e46.setGearbox("Manual");
        e46.setGearUsed();
        System.out.println(e46);


    }
}
