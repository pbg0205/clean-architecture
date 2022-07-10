package com.cooper.cleanarchitecture.account.application.port.out;

import com.cooper.cleanarchitecture.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);

}
