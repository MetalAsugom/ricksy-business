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
        if (this.credit - fee >= 1) {
            this.credit -= fee;
            return true;
        }
        return false;
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

    @Override
    public String toString() {
        return """
                owner: %s
                number: %s
                credit: %.2fEZI
                """.formatted(cardOwner(), number(), credit());
    }
}
