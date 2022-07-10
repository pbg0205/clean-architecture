package com.cooper.cleanarchitecture.account.application.port.out;

import com.cooper.cleanarchitecture.account.domain.Account;
import com.cooper.cleanarchitecture.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);

}
