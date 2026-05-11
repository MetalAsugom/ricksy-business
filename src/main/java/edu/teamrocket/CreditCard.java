package edu.teamrocket;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit = 3000;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public boolean pay(double fee) {
        return this.credit - fee != this.credit;
    }

    public String number() {
        return this.number;
    }

    public double credit() {
        return this.credit;
    }
}
