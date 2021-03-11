package com.company.Hw11March;

import java.util.List;
import java.util.Scanner;

public class Commodity {

    private String productName;
    private int productLength;
    private int productWidth;
    private int productWeight;

    public Commodity() {
    }

    public Commodity(String productName, int productLength, int productWidth, int productWeight) {
        this.productName = productName;
        this.productLength = productLength;
        this.productWidth = productWidth;
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductLength() {
        return productLength;
    }

    public void setProductLength(int productLength) {
        this.productLength = productLength;
    }

    public int getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(int productWidth) {
        this.productWidth = productWidth;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "productName='" + productName + '\'' +
                ", productLength=" + productLength +
                ", productWidth=" + productWidth +
                ", productWeight=" + productWeight +
                '}';
    }

    public void addProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        setProductName(scanner.next());

        System.out.println("Enter product length:");
        setProductLength(scanner.nextInt());

        System.out.println("Enter product width:");
        setProductWidth(scanner.nextInt());

        System.out.println("Enter product weight:");
        setProductWeight(scanner.nextInt());
    }

    public void removeProduct(List<Object> list, String name){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        getProductName();
    }

}
