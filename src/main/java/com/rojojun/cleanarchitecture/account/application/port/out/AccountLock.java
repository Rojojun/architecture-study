package com.rojojun.cleanarchitecture.account.application.port.out;

import com.rojojun.cleanarchitecture.account.domain.Account;

public interface AccountLock {
    void lockAccount(Account.AccountId accountId);
    void releaseAccount(Account.AccountId accountId);
}
