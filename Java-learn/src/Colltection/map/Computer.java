package com.cyx.map;

public class Computer /*implements Comparable<Computer>*/{

    private String brand;

    private double price;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override
//    public int compareTo(Computer o) {
//        return Double.compare(price, o.price);
//    }
}
