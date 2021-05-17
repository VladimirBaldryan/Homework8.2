package com.company;

import java.util.Scanner;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int productNumber;

    public Store() {
    }

    public void inputStoreInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Store name");
        setName(scanner.next());
        System.out.println("Input quantity of workers");
        setCountOfWorkers(scanner.nextInt());
        System.out.println("Input phone number");
        setPhoneNumber(scanner.next());
        System.out.println("Input quantity of products");
        setProductNumber(scanner.nextInt());
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 2 || countOfWorkers > 50) {
            throw new IllegalArgumentException("quantity of worker must be min 2, max 50");
        }
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Store name must be not less then 3 character");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8) {
            throw new IllegalArgumentException("Wrong phone number inputted");
        } else {
            for (int i = 0; i < 8; i++) {
                boolean isDigit = Character.isDigit(phoneNumber.charAt(i));
                if (!isDigit) {
                    throw new IllegalArgumentException("Wrong phone number inputted");
                }
            }
        }
        this.phoneNumber = phoneNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    private int sellProduct() {
        return getProductNumber() - 1;
    }

    public void printStore() {
        System.out.println(getName() + " Store");
        System.out.println("Has a " + getCountOfWorkers() + " workers");
        System.out.println("Phone number is " + "+374" + getPhoneNumber());
        System.out.println("Store have " + getProductNumber() + " items");
        System.out.println();
    }

    public void printSell() {
        System.out.println("product quantity after sell will " + sellProduct());
    }
}
