package com.cooper.cleanarchitecture.account.application.service;

import java.time.LocalDateTime;

import com.cooper.cleanarchitecture.account.application.port.in.GetAccountBalanceQuery;
import com.cooper.cleanarchitecture.account.application.port.out.LoadAccountPort;
import com.cooper.cleanarchitecture.account.domain.Account.AccountId;
import com.cooper.cleanarchitecture.account.domain.Money;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}