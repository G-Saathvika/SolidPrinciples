package com.notsolid.main;

import com.notsolid.classes.*;

public class Test {
    public static void main(String[] args) {

        Library_Management manager = new Library_Management();
        manager.addBook("Harry Potter");

        Staff  staff = new Librarian();
        staff.loginAndLogout();

        Notification_Service type = new Notification_Service();
        type.notify("email");

        CreditCardPayment cc = new CreditCardPayment();
        FineTransaction fine = new FineTransaction(cc);
        fine.payFine(500);

    }
}


