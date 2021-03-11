package com.company.Hw11March;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Commodity commodity = new Commodity();
        //Ці об"єкти створені для тесту.
        Commodity tomato = new Commodity("Tomato", 10, 8, 120);
        Commodity potato = new Commodity("Potato", 9, 5, 70);
        Commodity milk = new Commodity("Milk", 11, 30, 1000);
        Commodity oats = new Commodity("Oats", 15, 20, 500);

        List<Commodity> commodityList = new ArrayList<>();
        commodityList.add(tomato);
        commodityList.add(potato);
        commodityList.add(milk);
        commodityList.add(oats);

        int num = 0;
        do{
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1: Add the product.");
            System.out.println("2: Delete the product.");
            System.out.println("3: Replace the product.");
            System.out.println("4: Sort bu name.");
            System.out.println("5: Sort by length.");
            System.out.println("6: Sort by width.");
            System.out.println("7: Sort by weight.");
            System.out.println("8: Display a product.");
            System.out.println("9: Exit.");
            num = scanner.nextInt();

            switch (num){
                case 1: {
                    commodity.addProduct();
                    if(commodity.getProductName() != null){
                        commodityList.add(commodity);
                    }
                    System.out.println(commodityList);
                    break;
                } case 2: {
                    Iterator<Commodity> iterator = commodityList.iterator();
                    System.out.println("Enter product name");
                    String productName = scanner.next();
                    while (iterator.hasNext()){
                        Commodity nextCommodity = iterator.next();
                        if(nextCommodity.getProductName().equals(productName)){
                            iterator.remove();
                        }
                    }
                    System.out.println(commodityList);
                    break;
                }
                default:
                    System.err.println("Incorrect number, please enter from 1 to 9.");
            }
        }while (num != 0);
    }
}
