package ru.rt.eip.boot.mdm.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.EmbeddedId


class MdmSubscriber(
        @EmbeddedId
        val id: MdmSubscriberId,
        val title: String,
        val susbscriberType: String
)

@Embeddable
class MdmSubscriberId constructor (
        @Column(name = "APP_PKID")
        val applicationId: Long,
        @Column(name = "LOCALSYSTEMID")
        val localSystemId: String,
        @Column(name = "VERSION")
        val version: Long) : Serializable
