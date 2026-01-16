package ex12;

public class Employee {

    private String employeeName;
    private int hours;
    private double valuePerHour;

    public Employee() {
    }

    public Employee(String employeeName, int hours, double valuePerHour) {
        this.employeeName = employeeName;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return getValuePerHour() * getHours();
    }

    @Override
    public String toString() {
        return getEmployeeName() + " - $" + String.format("%.2f", payment());
    }
}
