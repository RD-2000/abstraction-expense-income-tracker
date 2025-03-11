package com.rd.abstraction.repository;


import com.rd.abstraction.model.Wallet;

import java.util.ArrayList;
import java.util.List;

public class WalletRepository extends BaseRepository<Wallet> {
    private List<Wallet> wallets = new ArrayList<>();

    @Override
    public void save(Wallet wallet) {
        wallets.add(wallet);
    }

    @Override
    public Wallet get(int id) {
        return wallets.stream().filter(w -> w.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Wallet> getAll() {
        return wallets;
    }
}

