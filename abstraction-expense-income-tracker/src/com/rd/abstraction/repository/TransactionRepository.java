package com.rd.abstraction.repository;


import com.rd.abstraction.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository extends BaseRepository<Transaction> {
    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public void save(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public Transaction get(int id) {
        return null; // Not applicable
    }

    @Override
    public List<Transaction> getAll() {
        return transactions;
    }

    public List<Transaction> getTransactionsByWallet(int walletId) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getWalletId() == walletId) {
                result.add(t);
            }
        }
        return result;
    }
}

