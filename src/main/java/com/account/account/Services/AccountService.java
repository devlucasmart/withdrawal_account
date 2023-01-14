package com.account.account.Services;

import com.account.account.entities.Money;

import java.util.ArrayList;

public class AccountService {
    static ArrayList<Money> listaMoney = new ArrayList<Money>();
    public void adicionar(Money money) {
        listaMoney.add(money);
    }
    public void saque(Money money) {
        listaMoney.remove(money);
    }



}
