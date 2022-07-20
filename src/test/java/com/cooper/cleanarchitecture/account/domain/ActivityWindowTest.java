package com.cooper.cleanarchitecture.account.domain;

import com.cooper.cleanarchitecture.account.domain.Account.AccountId;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static com.cooper.cleanarchitecture.common.ActivityTestData.defaultActivity;
import static org.assertj.core.api.Assertions.assertThat;

public class ActivityWindowTest {

    @Test
    void calculatesStartTimestamp() {
        ActivityWindow window = new ActivityWindow(
                defaultActivity().withTimestamp(startDate()).build(),
                defaultActivity().withTimestamp(inBetweenDate()).build(),
                defaultActivity().withTimestamp(endDate()).build());

        assertThat(window.getStartTimestamp()).isEqualTo(startDate());
    }

    @Test
    void calculatesEndTimestamp() {
        ActivityWindow window = new ActivityWindow(
                defaultActivity().withTimestamp(startDate()).build(),
                defaultActivity().withTimestamp(inBetweenDate()).build(),
                defaultActivity().withTimestamp(endDate()).build());

        assertThat(window.getEndTimestamp()).isEqualTo(endDate());
    }

    @Test
    void calculatesBalance() {

        AccountId account1 = new AccountId(1L);
        AccountId account2 = new AccountId(2L);

        ActivityWindow window = new ActivityWindow(
                defaultActivity()
                        .withSourceAccountId(account1)
                        .withTargetAccountId(account2)
                        .withMoney(Money.of(999)).build(),
                defaultActivity()
                        .withSourceAccountId(account1)
                        .withTargetAccountId(account2)
                        .withMoney(Money.of(1)).build(),
                defaultActivity()
                        .withSourceAccountId(account2)
                        .withTargetAccountId(account1)
                        .withMoney(Money.of(500)).build());

        assertThat(window.calculateBalance(account1)).isEqualTo(Money.of(-500));
        assertThat(window.calculateBalance(account2)).isEqualTo(Money.of(500));
    }

    private LocalDateTime startDate() {
        return LocalDateTime.of(2019, 8, 3, 0, 0);
    }

    private LocalDateTime inBetweenDate() {
        return LocalDateTime.of(2019, 8, 4, 0, 0);
    }

    private LocalDateTime endDate() {
        return LocalDateTime.of(2019, 8, 5, 0, 0);
    }

}
