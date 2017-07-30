package ru.rt.eip.boot.mdm.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "entitymapping")
class EntityMapping(
        @Id @Column(name = "PKID")
        val id: Long,
        @Column(name = "SRCREF1_LOCALSYSTEMID")
        val localSystemId: String,
        @Column(name = "SRCREF1_APP_PKID")
        val applicationId: Long,
        @Column(name = "SRCREF1_CURRENTVERSION")
        val version: Long,
        @Column(name = "TAGREF1_LOCALSYSTEMID")
        val mdmLocalSystemId: String,
        @Column(name = "TAGREF1_APP_PKID")
        val mdmApplicationId: Long,
        @Column(name = "TAGREF1_CURRENTVERSION")
        val mdmVersion: Long,
        @Column(name = "SRCREF2_LOCALSYSTEMID")
        val refLocalSystemId: String?,
        @Column(name = "SRCREF2_APP_PKID")
        val refApplicationId: Long?,
        @Column(name = "SRCREF2_CURRENTVERSION")
        val reVersion: Long?)

