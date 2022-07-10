package com.cooper.cleanarchitecture.account.application.port.in;

import com.cooper.cleanarchitecture.account.domain.Account;
import com.cooper.cleanarchitecture.account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);

}
