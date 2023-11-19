package com.rojojun.cleanarchitecture.account.application.port.in;

import com.rojojun.cleanarchitecture.account.domain.Account;
import com.rojojun.cleanarchitecture.account.domain.Money;
import com.rojojun.cleanarchitecture.common.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {
    public SendMoneyCommand(Account.AccountId sourceAccountId, Account.AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
//        requireGreaterThan(money, 0);
        this.validateSelf();
    }

    @NotNull
    private final Account.AccountId sourceAccountId;
    @NotNull
    private final Account.AccountId targetAccountId;
    @NotNull
    private final Money money;
}
