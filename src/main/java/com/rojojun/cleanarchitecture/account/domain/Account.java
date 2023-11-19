package com.rojojun.cleanarchitecture.account.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Account {
    @Getter private final AccountId id;
    @Getter private final ActivityWindow activityWindow;
    @Getter private Money baselineBalance;

    @Value
        public record AccountId(Long value) {
    }

    public static Account withoutId(Money baselineBalance, ActivityWindow activityWindow) {
        return new Account(null, activityWindow, baselineBalance);
    }

    public static Account withId(AccountId accountId, Money baselineBalance, ActivityWindow activityWindow){
        return new Account(accountId, activityWindow, baselineBalance);
    }

    public Optional<AccountId> getId() {
        return Optional.ofNullable(this.id);
    }

    public Money calculateBalance() {
        return Money.add(
                this.baselineBalance,
                this.activityWindow.calculateBalance(this.id)
        );
    }

    public boolean withdraw(Money money, AccountId tartgetAccountId) {
        if(!mayWithdraw(money)) {
            return false;
        }

        Activity widrawal = new Activity(
                this.id,
                this.id,
                tartgetAccountId,
                LocalDateTime.now(),
                money
        );
        this.activityWindow.addActivity(widrawal);
        return true;
    }

    private boolean mayWithdraw(Money money) {
        return Money.add(
                        this.calculateBalance(),
                        money.negate())
                .isPositiveOrZero();
    }
}
