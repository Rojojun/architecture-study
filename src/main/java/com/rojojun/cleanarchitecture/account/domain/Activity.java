package com.rojojun.cleanarchitecture.account.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.Locale;

@Value
@RequiredArgsConstructor
public class Activity {
    @Getter
    private ActivityId id;

    @Getter
    @NonNull
    private final Account.AccountId ownerAccountId;

    @Getter
    @NonNull
    private final Account.AccountId sourceAccountId;

    @Getter
    @NonNull
    private final Account.AccountId targetAccountId;

    @Getter
    @NonNull
    private final LocalDateTime timeStamp;

    @Getter
    @NonNull
    private final Money money;

    public Activity(
            @NonNull Account.AccountId ownerAccountId,
            @NonNull Account.AccountId sourceAccountId,
            @NonNull Account.AccountId targetAccountId,
            @NonNull LocalDateTime timeStamp,
            @NonNull Money money
            ) {
        this.id = null;
        this.ownerAccountId = ownerAccountId;
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.timeStamp = timeStamp;
        this.money = money;
    }

    @Value
    public static class ActivityId {
        private final Long value;
    }
}
