package com.rojojun.cleanarchitecture.account.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Account {
    @Getter private final AccountId id;
    @Getter private Money baselineBalance;

    @Value
        public record AccountId(Long value) {
    }
}
