package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
            String coffeeType = "Latte"; // Favorite type of coffee
            System.out.println("My favorite type of coffee is " + coffeeType);

            double lattePrice = 6.99; // Latte price per cup
            System.out.println("Price per cup of latte is " + lattePrice);

            int quantity = 1;
            System.out.println("Cups per order is " + quantity);

            double total = lattePrice * quantity;
            System.out.println("You bought " + quantity + " " + coffeeType + " for $" + total);

        }
    }
