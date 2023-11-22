package com.rojojun.cleanarchitecture.account.application.service;

import com.rojojun.cleanarchitecture.account.application.port.in.GetAccountBalanceQuery;
import com.rojojun.cleanarchitecture.account.application.port.out.LoadAccountPort;
import com.rojojun.cleanarchitecture.account.domain.Account;
import com.rojojun.cleanarchitecture.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {
    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
