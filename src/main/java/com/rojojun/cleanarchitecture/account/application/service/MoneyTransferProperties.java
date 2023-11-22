package com.rojojun.cleanarchitecture.account.application.service;

import com.rojojun.cleanarchitecture.account.domain.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 돈을 송금하는 유스케이스에 대한 설정
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferProperties {
    public Money maximumTransferThreshold = Money.of(1_000_000L);
}
