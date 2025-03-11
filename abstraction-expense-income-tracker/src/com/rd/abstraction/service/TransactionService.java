package com.rd.abstraction.service;


import com.rd.abstraction.model.Transaction;
import com.rd.abstraction.repository.TransactionRepository;

public class TransactionService extends BaseService {
    private TransactionRepository transactionRepository = new TransactionRepository();

    public void addTransaction(int walletId, String type, double amount) {
        transactionRepository.save(new Transaction(walletId, type, amount));
    }

    public void viewTransactions(int walletId) {
        for (Transaction t : transactionRepository.getTransactionsByWallet(walletId)) {
            System.out.println(t);
        }
    }

    @Override
    public void execute() {
        System.out.println("TransactionService is running...");
    }
}
