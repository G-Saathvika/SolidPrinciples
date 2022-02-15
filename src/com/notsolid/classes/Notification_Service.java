package com.notsolid.classes;

public class Notification_Service {

    public void notify(String typeOfNotification) {
        //violates Open-Closed Principle
        if (typeOfNotification.equalsIgnoreCase("email")) {
            System.out.println("Notification sent through email.");
        } else if (typeOfNotification.equalsIgnoreCase("post")) {
            System.out.println("Notification sent through post.");
        }
    }

}
