package ge.edu.btu.currency;

import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;

public class Main {


    public static void main(String[] args) {

        CurrencyServiceImpl main_class = new CurrencyServiceImpl();

        main_class.setExchangeRate(3);
        main_class.convert(122.3);
    }

}
