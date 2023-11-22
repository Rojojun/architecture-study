package com.rojojun.cleanarchitecture.account.application.port.in;

import com.rojojun.cleanarchitecture.account.domain.Account;
import com.rojojun.cleanarchitecture.account.domain.Account.AccountId;
import com.rojojun.cleanarchitecture.account.domain.Money;
import com.rojojun.cleanarchitecture.common.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {
    public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }

    @NotNull
    private final AccountId sourceAccountId;
    @NotNull
    private final AccountId targetAccountId;
    @NotNull
    private final Money money;
}
