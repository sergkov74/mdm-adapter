package ru.rt.eip.boot.mdm.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.rt.eip.boot.mdm.model.MdmSubscriber
import ru.rt.eip.boot.mdm.model.MdmSubscriberId

@Repository
interface MdmSubscriberRepository: JpaRepository<MdmSubscriber, MdmSubscriberId> {
}