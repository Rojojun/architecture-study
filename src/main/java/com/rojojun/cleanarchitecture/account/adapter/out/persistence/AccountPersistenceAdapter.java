package com.rojojun.cleanarchitecture.account.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AccountPersistenceAdapter {
        private final AccountRepository accountRepository;
        private final ActivityRepository activityRepository;
}
