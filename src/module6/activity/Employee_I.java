package module6.activity;

public class Employee_I extends Person_I {
    private String title;
    private double salary;

    public Employee_I() {
        System.out.println("I'm Employee_I constructor");
    }

    public Employee_I(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
