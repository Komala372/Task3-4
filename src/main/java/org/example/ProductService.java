package org.example;


public class ProductService {

    public static void main(String[] args) {

        Product[] products = {new Product(1,1000),new Product(2,4000),new Product(3,6000)};
        for (Product product:products) {
            product.display(product);
            product.findProductById(1,product);
        }
    }





}