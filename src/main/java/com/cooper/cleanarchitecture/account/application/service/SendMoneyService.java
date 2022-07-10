package com.cooper.cleanarchitecture.account.application.service;

import com.cooper.cleanarchitecture.account.application.port.out.AccountLock;
import com.cooper.cleanarchitecture.account.application.port.in.SendMoneyCommand;
import com.cooper.cleanarchitecture.account.application.port.in.SendMoneyUseCase;
import com.cooper.cleanarchitecture.account.application.port.out.LoadAccountPort;
import com.cooper.cleanarchitecture.account.application.port.out.UpdateAccountStatePort;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountLock accountLock;
    private final UpdateAccountStatePort updateAccountStatePort;

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        //TODO: 비즈니스 규칙 적용
        //TODO: 모델 상태 조작
        //TODO: 출력 값 반환
        return false;
    }

}
