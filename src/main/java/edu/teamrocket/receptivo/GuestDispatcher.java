package edu.teamrocket.receptivo;

import edu.teamrocket.payment.PaymentMethod;

public interface GuestDispatcher {
    void dispatch(PaymentMethod usuario);
}
