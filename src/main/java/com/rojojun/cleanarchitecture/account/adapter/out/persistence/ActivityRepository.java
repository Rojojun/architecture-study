package com.rojojun.cleanarchitecture.account.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface ActivityRepository extends JpaRepository<ActivityJpaEntity,Long> {
    List<ActivityJpaEntity> findByOwnAccountIdAndTimestampAfter(Long ownerAccountId, LocalDateTime since);
    Long countByTargetAccountIdAndTimestampBefore(Long targetAccountId, LocalDateTime since);
    Long countByOwnAccountIdAndTimestampBefore(Long ownAccountId, LocalDateTime since);
}
