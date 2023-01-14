package com.account.account.entities;

import java.util.Objects;

public class Money {
    public double valor;

    public Money(double valor) {
        super();
        this.valor = valor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Double.compare(money.valor, valor) == 0;
    }

}
