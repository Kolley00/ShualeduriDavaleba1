package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    private int exchangeRate;

    @Override
    public void convert(double amount) {

        System.out.println("Exchanged money is " + amount / exchangeRate);


    }

    @Override
    public void setExchangeRate(int exchangeRate) {

        this.exchangeRate = exchangeRate;

    }
}
