package com.cooper.cleanarchitecture.common;

import com.cooper.cleanarchitecture.account.domain.Activity;
import com.cooper.cleanarchitecture.account.domain.Money;

import java.time.LocalDateTime;

import static com.cooper.cleanarchitecture.account.domain.Account.AccountId;
import static com.cooper.cleanarchitecture.account.domain.Activity.ActivityId;

public class ActivityTestData {

    public static ActivityBuilder defaultActivity() {
        return new ActivityBuilder()
                .withOwnerAccountId(new AccountId(42L))
                .withSourceAccountId(new AccountId(42L))
                .withTargetAccountId(new AccountId(41L))
                .withTimestamp(LocalDateTime.now())
                .withMoney(Money.of(999L));
    }

    public static class ActivityBuilder {

        private ActivityId id;
        private AccountId ownerAccountId;
        private AccountId sourceAccountId;
        private AccountId targetAccountId;
        private LocalDateTime timestamp;
        private Money money;

        public ActivityBuilder withId(ActivityId id) {
            this.id = id;
            return this;
        }

        public ActivityBuilder withOwnerAccountId(AccountId accountId) {
            this.ownerAccountId = accountId;
            return this;
        }

        public ActivityBuilder withSourceAccountId(AccountId accountId) {
            this.sourceAccountId = accountId;
            return this;
        }

        public ActivityBuilder withTargetAccountId(AccountId accountId) {
            this.targetAccountId = accountId;
            return this;
        }

        public ActivityBuilder withTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ActivityBuilder withMoney(Money money) {
            this.money = money;
            return this;
        }

        public Activity build() {
            return new Activity(
                    this.id,
                    this.ownerAccountId,
                    this.sourceAccountId,
                    this.targetAccountId,
                    this.timestamp,
                    this.money
            );
        }

    }

}
