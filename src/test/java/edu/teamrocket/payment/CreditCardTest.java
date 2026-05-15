package edu.teamrocket.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class CreditCardTest {

    private PaymentMethod card = null;

    @BeforeEach
    void setupCard() {
        card = new CreditCard("Abradolf Lincler", "4916119711304546");
        assertNotNull(card, "CreditCard creada");
    }
    @Test
    void constructorTest() {  
        assertNotNull(card, "CreditCard creada");      
        assertEquals("4916119711304546", card.number());
    }

    @Test
    void payTestOK() {
        assertTrue(card.pay(2999.0));
        assertEquals(1.0, card.credit(), 0);
    }

    @Test
    void payTestNOTOKZERO() {
        assertFalse(card.pay(2999.1));
        assertEquals(3000, card.credit(), 0.1);
    }

    @Test
    void payTestNOTOK() {
        assertFalse(card.pay(4000));
        assertEquals(3000, card.credit(), 0);
    }
}
