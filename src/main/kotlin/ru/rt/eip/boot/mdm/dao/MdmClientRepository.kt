package ru.rt.eip.boot.mdm.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.rt.eip.boot.mdm.model.MdmClient
import ru.rt.eip.boot.mdm.model.MdmClientId

@Repository
interface MdmClientRepository: JpaRepository<MdmClient, MdmClientId> {
}