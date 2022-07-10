package com.cooper.cleanarchitecture.account.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Account {

    @Getter
    private final AccountId id;

    @Getter
    private final Money baselineBalance;

    @Getter
    private final ActivityWindow activityWindow;

    public Money calculateBalance() {
        return Money.add(this.baselineBalance, this.activityWindow.calculateBalance(this.id));
    }

    @Value
    public static class AccountId {
        private String value;
    }

}
