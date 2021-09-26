package com.codecool.SpringDemo.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private final NbpClient client;

    @Autowired
    public CurrencyService(NbpClient client) {
        this.client = client;
    }

    public void getCurrencies(){
        client.getCurrenciesRate();
    }
}
