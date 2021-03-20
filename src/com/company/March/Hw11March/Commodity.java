package com.company.March.Hw11March;

import java.util.Comparator;
import java.util.Scanner;

public class Commodity implements Comparable<Commodity>{

    private String productName;
    private int productLength;
    private int productWidth;
    private int productWeight;

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

    //Для тесту.
    @Override
    public String toString() {
        return "Commodity{" +
                "productName='" + productName + '\'' +
                ", productLength=" + productLength +
                ", productWidth=" + productWidth +
                ", productWeight=" + productWeight +
                '}';
    }

    public static Commodity createNewProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        String name = scanner.next();

        System.out.println("Enter product length:");
        int length = scanner.nextInt();

        System.out.println("Enter product width:");
        int width = scanner.nextInt();

        System.out.println("Enter product weight:");
        int weight = scanner.nextInt();
        return new Commodity(name, length, width, weight);
    }

    @Override
    public int compareTo(Commodity o) {
        int result = productName.compareTo(o.getProductName());
        return result;
    }

    static class CommodityLengthComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            if(o1.getProductLength() > o2.getProductLength()){
                return 1;
            }else if(o1.getProductLength() < o2.getProductLength()){
                return -1;
            }else {
                return 0;
            }
        }
    }

    static class CommodityWeightComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            if(o1.getProductWeight() > o2.getProductWeight()){
                return 1;
            }else if(o1.getProductWeight() < o2.getProductWeight()){
                return -1;
            }else {
                return 0;
            }
        }
    }

    static class CommodityWidthComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            if(o1.getProductWidth() > o2.getProductWidth()){
                return 1;
            }else if(o1.getProductWidth() < o2.getProductWidth()){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
