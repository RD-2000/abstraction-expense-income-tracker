package com.rd.abstraction.controller;

import com.rd.abstraction.service.TransactionService;
import com.rd.abstraction.service.UserService;
import com.rd.abstraction.service.WalletService;

import java.util.Scanner;

public class MainController {
    private UserService userService = new UserService();
    private WalletService walletService = new WalletService();
    private TransactionService transactionService = new TransactionService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Wallet Manager!");
        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    userService.registerUser(username, password);
                    break;
                case 2:
                    System.out.print("Username: ");
                    username = scanner.nextLine();
                    System.out.print("Password: ");
                    password = scanner.nextLine();
                    if (userService.loginUser(username, password) != null) {
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid Credentials.");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}
