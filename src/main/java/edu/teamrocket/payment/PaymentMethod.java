package edu.teamrocket.payment;

public interface PaymentMethod {

    boolean pay(double fee);

    String cardNumbers();
}