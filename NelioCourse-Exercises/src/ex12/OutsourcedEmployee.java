package ex12;

public class OutsourcedEmployee extends Employee{

    private double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String employeeName, int hours, double valuePerHour, double additionalCharge) {
        super(employeeName, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
