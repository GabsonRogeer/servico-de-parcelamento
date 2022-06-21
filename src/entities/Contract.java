package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Contract {
    private String number;
    private String name;
    private Date date;
    private Double totalValue;

    private final List<Installment> installments = new ArrayList<>();

    public Contract(String name, Date date, Double totalValue) {
        Random random = new Random();
        this.number = "" + random.nextInt(4) + "-" + random.nextInt(1);
        this.name = name;
        this.date = date;
        this.totalValue = totalValue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }

    public void removeInstallment(Installment installment) {
        installments.remove(installment);
    }

}
