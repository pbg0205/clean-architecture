package com.cooper.cleanarchitecture.account.application.port.out;

import static com.cooper.cleanarchitecture.account.domain.Account.AccountId;

public interface AccountLock {

    void lockAccount(AccountId accountId);

    void releaseAccount(AccountId accountId);

}