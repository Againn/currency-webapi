package com.springboot.currencywebapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CurrencyRateQueryController {

    @Autowired
    private CurrencyRateService currencyRateService;
}
