package edu.teamrocket.dispatchers;

import java.util.HashMap;
import java.util.Map;

import edu.teamrocket.payment.CreditCard;

public class UfosPark {

    private Map<String, String> flota = new HashMap<>();
    private static final double fee = 500;

    public void add(String ovni) {
        flota.putIfAbsent(ovni, null);
    }

    public void dispatch(CreditCard usuario){

        if (flota.containsValue(usuario.number()) && usuario.pay(fee)) {
            usuario.pay(fee);
            for (var ovni : flota.keySet()) {
                flota.putIfAbsent(ovni, usuario.number());
            }
            
            
            
            /*x -> flota.replace(x, usuario.number()) == null)*/;
        } else {
            
        }
    }
}
