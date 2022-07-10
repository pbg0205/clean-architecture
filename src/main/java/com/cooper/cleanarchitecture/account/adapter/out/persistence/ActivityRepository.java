package com.cooper.cleanarchitecture.account.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface ActivityRepository extends JpaRepository<ActivityJpaEntity, Long> {

    //TODO: JPQL -> QueryDSL 로 해결하기 (문법상 오류를 컴파일시점에서 잡아낼 수 있다.)

}
