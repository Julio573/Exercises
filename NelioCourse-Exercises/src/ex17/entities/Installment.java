package ex17.entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate dueDate;
    private int installment;

    public Installment() {
    }

    public Installment(LocalDate dueDate, int installment) {
        this.dueDate = dueDate;
        this.installment = installment;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }
}
