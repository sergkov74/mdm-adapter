package ru.rt.eip.boot.mdm.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.rt.eip.boot.mdm.model.EntityMapping

@Repository
interface EntityMappingRepository: CrudRepository<EntityMapping, Long> {
    fun findByLocalSystemIdAndApplicationIdAndVersion(
            localSystemId: String,
            applicationId: Long,
            version: Long): EntityMapping

}