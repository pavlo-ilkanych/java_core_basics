package com.company.Hw11March;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ці об"єкти створені для тесту.
        Commodity tomato = new Commodity("Tomato", 10, 8, 120);
        Commodity potato = new Commodity("Potato", 9, 5, 70);
        Commodity milk = new Commodity("Milk", 11, 30, 1000);
        Commodity oats = new Commodity("Oats", 15, 20, 500);

        List<Commodity> commodityList = new ArrayList<Commodity>();
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
                    Commodity newCommodity = Commodity.createNewProduct();
                    if(newCommodity.getProductName() != null){
                        commodityList.add(newCommodity);
                    }
                    System.out.println(commodityList); //Для тесту.
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
                } case 3: {
                    System.out.println("Enter product name");
                    String productName = scanner.next();
                    for (Commodity commodity : commodityList)
                        if(commodity.getProductName().equalsIgnoreCase(productName)){
                            commodity.setProductName(scanner.next());
                            commodity.setProductLength(scanner.nextInt());
                            commodity.setProductWidth(scanner.nextInt());
                            commodity.setProductWeight(scanner.nextInt());
                        }
                    System.out.println(commodityList);
                    break;
                } case 4: {
                    Collections.sort(commodityList);
                    for (Commodity a : commodityList){
                        System.out.println(a);
                    }
                    break;
                } case 5: {
                    Collections.sort(commodityList, new CommodityLengthComparator());
                    for (Commodity a : commodityList){
                        System.out.println(a);
                    }
                    break;
                } case 6: {
                    Collections.sort(commodityList, new CommodityWidthComparator());
                    for (Commodity a : commodityList){
                        System.out.println(a);
                    }
                    break;
                } case 7: {
                    Collections.sort(commodityList, new CommodityWeightComparator());
                    for (Commodity a : commodityList){
                        System.out.println(a);
                    }
                    break;
                } case 8: {
                    System.out.println("Enter product name");
                    for(Commodity a : commodityList){
                        if(a.getProductName().equalsIgnoreCase(scanner.next())){
                            System.out.println(a);
                        }
                    }
                } case 9: {
                    System.exit(0);
                }
                default:
                    System.err.println("Incorrect number, please enter from 1 to 9.");
            }
        }while (num != 0);
    }

}
