package ru.rt.eip.boot.mdm.model


class MdmSubscriber(
        val localSystemId: String,
        val applicationId: Long,
        val version: Long,
        val clientLocalSystemId: String,
        val clientApplicationId: Long,
        val clientVersion: Long,
        val title: String?,
        val subscriberType: String?)