package ru.rt.eip.boot.mdm.model

class MdmClient(
        val localSystemId: String,
        val applicationId: Long,
        val version: Long,
        val nls: String?,
        val title: String?,
        val shortName: String?,
        val inn: String?)
