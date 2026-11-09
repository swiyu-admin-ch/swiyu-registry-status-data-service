/*
 * SPDX-FileCopyrightText: 2025 Swiss Confederation
 *
 * SPDX-License-Identifier: MIT
 */

package ch.admin.bj.swiyu.registry.status.data.domain;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VcEntityRepository extends JpaRepository<VcEntity, Long> {
    @Query(
        """
        select v.rawVc
            from DatastoreEntity d
            join VcEntity v
              on d.id = v.base.id
            where d.id = :baseId
              and v.vcType = :vcType
              and d.status = 'ACTIVE'
        """
    )
    Optional<String> findActiveRawVcForStatusList(UUID baseId, VcType vcType);
}
