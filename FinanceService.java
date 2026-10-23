package com.wealthtrace.api.service;

import org.springframework.stereotype.Service;

@Service
public class FinanceService {
    public Double calculateProfit(Double currentPrice, Double buyPrice, Double amount) {
        return (currentPrice - buyPrice) * amount;
    }
}