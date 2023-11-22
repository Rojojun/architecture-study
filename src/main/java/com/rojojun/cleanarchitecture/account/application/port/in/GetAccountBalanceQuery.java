package com.rojojun.cleanarchitecture.account.application.port.in;

import com.rojojun.cleanarchitecture.account.domain.Account.AccountId;
import com.rojojun.cleanarchitecture.account.domain.Money;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(AccountId accountId);
}
