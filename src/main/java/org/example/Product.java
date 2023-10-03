package org.example;

public class Product {


    private long id;

    private double price;

    public Product(long id, double price) {
        this.id = id;
        this.price = price;
    }

    void increasePriceBy(double amount){
        price = price+amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void display(Product product){
        System.out.println(product.getId());
        System.out.println(product.getPrice());
    }

    void findProductById(long id,Product product){
            if(product.getId() == id){
                System.out.println("Product id::" +product.getId()+ " Product price:: "+product.getPrice());
            }
        }
    }

