package com.rd.abstraction.service;


import com.rd.abstraction.model.Wallet;
import com.rd.abstraction.repository.WalletRepository;

public class WalletService extends BaseService {
    private WalletRepository walletRepository = new WalletRepository();

    public void createWallet(String name, double balance) {
        Wallet wallet = new Wallet(walletRepository.getAll().size() + 1, name, balance);
        walletRepository.save(wallet);
    }

    public void viewWallets() {
        for (Wallet wallet : walletRepository.getAll()) {
            System.out.println(wallet);
        }
    }

    @Override
    public void execute() {
        System.out.println("WalletService is running...");
    }
}

