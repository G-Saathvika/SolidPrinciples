package com.soild.classes;

import com.soild.interfaces.NotificationService;

public class EmailNotification implements NotificationService {

        @Override
        public void sendNotification() {
            System.out.println("Sent notification through email.");
        }

}


