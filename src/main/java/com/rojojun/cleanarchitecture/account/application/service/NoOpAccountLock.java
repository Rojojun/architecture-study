package com.rojojun.cleanarchitecture.account.application.service;

import com.rojojun.cleanarchitecture.account.application.port.out.AccountLock;
import com.rojojun.cleanarchitecture.account.domain.Account;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {
    @Override
    public void lockAccount(Account.AccountId accountId) {
        // 아무것도 안함
    }

    @Override
    public void releaseAccount(Account.AccountId accountId) {
        // 아무것도 안함
    }
}
