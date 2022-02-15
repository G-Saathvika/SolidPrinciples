package com.notsolid.classes;

//import com.notsolid.Transaction;

public class DebitCardPayment extends Transaction {
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Debit card:");
        System.out.println(amount);
    }
}
