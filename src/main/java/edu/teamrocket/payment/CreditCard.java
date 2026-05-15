package edu.teamrocket.payment;

public class CreditCard implements PaymentMethod {
    private final String owner;
    private final String number;
    private double credit = 3000;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    @Override
    public boolean pay(double fee) {
        boolean isEnough = (this.credit - fee > 0);
        if (isEnough) {
            this.credit -= fee;
            return isEnough;
        } else {
            return isEnough;
        }
    }

    @Override
    public String number() {
        return this.number;
    }
    
    @Override
    public double credit() {
        return this.credit;
    }

    public String cardOwner() {
        return this.owner;
    }
}
