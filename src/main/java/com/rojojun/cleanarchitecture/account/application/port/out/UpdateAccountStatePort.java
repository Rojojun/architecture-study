package com.rojojun.cleanarchitecture.account.application.port.out;

import com.rojojun.cleanarchitecture.account.domain.Account;

public interface UpdateAccountStatePort {
    void updateActivities(Account account);
}
