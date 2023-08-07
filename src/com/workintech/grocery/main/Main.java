package com.workintech.grocery.main;

import com.workintech.grocery.groceryList.MarketCar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> groceryList=new LinkedList<>();
        startGrocery(groceryList);
    }

    //Uygulamayı başlatacak metodum.Uygulama başlatma işini MarkerCar yapmayacak.
    //Herkesin kendi görevi var.(Single responsibility)
    public static void startGrocery(List<String> groceryList) {
        Scanner scanner = new Scanner(System.in);

        while (true)
            try {
                System.out.println("Yapmak istediğiniz işlemi girin.");
                int process = scanner.nextInt();
                if (process < 0 || process > 2) {
                    System.out.println("process must be between 0 and 2");
                }

                if (process == 0) {
                    System.exit(0);
                }

                if (process == 1) {
                    MarketCar.addItems(groceryList);

                }

                if (process == 2) {
                    MarketCar.removeItems(groceryList);

                }

            } catch (Exception e) {
                System.out.println("Invalid process" + e.getMessage());
                System.exit(0);
            }
    }


}