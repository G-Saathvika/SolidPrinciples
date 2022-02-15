package com.notsolid.classes;

//import com.notsolid.Transaction;

public class CreditCardPayment extends Transaction {
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Credit card:");
        System.out.println(amount);
    }

}