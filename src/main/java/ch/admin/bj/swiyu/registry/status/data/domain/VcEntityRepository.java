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
    Optional<VcEntity> findByBase_IdAndVcType(UUID baseId, VcType vcType); // NOSONAR: Ignore warning for snake case variables because it is a spring data pattern

    @Query(
        """
            select v.rawVc
            from VcEntity v
            where v.base.id = :baseId
              and v.vcType = :vcType
        """
    )
    Optional<String> findRawVcForStatusList(UUID baseId, VcType vcType);
}
