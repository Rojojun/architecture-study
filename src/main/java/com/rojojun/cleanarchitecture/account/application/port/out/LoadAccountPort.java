package com.rojojun.cleanarchitecture.account.application.port.out;

import com.rojojun.cleanarchitecture.account.domain.Account;
import com.rojojun.cleanarchitecture.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {
    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
