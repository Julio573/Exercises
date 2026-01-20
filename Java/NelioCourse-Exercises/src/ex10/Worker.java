package ex10;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String workerName;
    private WorkerLevel workerLevel;
    private double baseSalary;
    private Department department;
    private final List<HourContract> contractList = new ArrayList<>();

    public Worker() {
    }

    public Worker(String workerName, WorkerLevel workerLevel, double baseSalary, Department department) {
        this.workerName = workerName;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContractList() {
        return contractList;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        contractList.add(contract);
    }

    public void removeContract(HourContract contract) {
        contractList.remove(contract);
    }

    public double income(int month, int year) {
        double income = getBaseSalary();
        for (HourContract contract : contractList) {
            if (contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year) {
                income += contract.totalValue();
            }
        }
        return income;
    }
}

