package com.cooper.cleanarchitecture.account.adapter.out.persistence;

import com.cooper.cleanarchitecture.account.application.port.out.LoadAccountPort;
import com.cooper.cleanarchitecture.account.application.port.out.UpdateAccountStatePort;
import com.cooper.cleanarchitecture.account.domain.Account;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountStatePort {

    private final SpringDataAccountRepository accountRepository;
    private final ActivityRepository activityRepository;

    @Override
    public Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate) {
        return null;
    }

    @Override
    public void updateActivities(Account account) {

    }

}
