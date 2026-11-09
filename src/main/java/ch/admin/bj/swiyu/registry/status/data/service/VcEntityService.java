/*
 * SPDX-FileCopyrightText: 2025 Swiss Confederation
 *
 * SPDX-License-Identifier: MIT
 */

package ch.admin.bj.swiyu.registry.status.data.service;

import ch.admin.bj.swiyu.registry.status.data.common.exception.ResourceNotFoundException;
import ch.admin.bj.swiyu.registry.status.data.domain.VcEntityRepository;
import ch.admin.bj.swiyu.registry.status.data.domain.VcType;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class VcEntityService {

    private final VcEntityRepository vcEntityRepository;
    private final DatastoreEntityService datastoreEntityService;

    @Transactional(readOnly = true)
    public String getTokenStatusListJWT(UUID id) {
        return this.vcEntityRepository.findActiveRawVcForStatusList(id, VcType.TokenStatusListJWT).orElseThrow(() -> {
                this.datastoreEntityService.checkCanShow(this.datastoreEntityService.getDatastoreEntity(id));
                return new ResourceNotFoundException(id.toString());
            });
    }
}
