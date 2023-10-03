package com.feedback.in;

public class Feedback {

    private int id;

    private String description;

    private Customer customer;

    public Feedback(int id, String description, Customer customer) {
        this.id = id;
        this.description = description;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
