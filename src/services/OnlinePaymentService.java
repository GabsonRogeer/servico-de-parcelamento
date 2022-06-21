package services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(Double amount, Integer months);
}
