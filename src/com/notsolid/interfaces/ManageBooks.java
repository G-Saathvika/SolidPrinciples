package com.notsolid.interfaces;

public interface ManageBooks{
    //violates Interface Segregation Principle
    public void addBook(String name);
    public void removeBook(String name);
}