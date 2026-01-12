package ex3;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee() {
    }

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(double percentage) {
        double increase = getGrossSalary() * percentage / 100;
        setGrossSalary(getGrossSalary() + increase);
    }

    @Override
    public String toString() {
        return this.getName() +
                ", $" +
                String.format("%.2f%n", netSalary());
    }
}
