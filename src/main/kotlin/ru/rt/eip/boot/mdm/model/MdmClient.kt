package ru.rt.eip.boot.mdm.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "CLIENT")
class MdmClient(
        @EmbeddedId
        val id: MdmClientId,
        @Column(name = "NLS")
        val nls: String,
        @Column(name = "TITLE")
        val title: String,
        @Column(name = "SHORTNAME")
        val shortName: String,
        @Column(name = "INN")
        val inn: String) {
}

@Embeddable
class MdmClientId constructor (
        @Column(name = "APP_PKID")
        val applicationId: Long,
        @Column(name = "LOCALSYSTEMID")
        val localSystemId: String,
        @Column(name = "VERSION")
        val version: Long) : Serializable
