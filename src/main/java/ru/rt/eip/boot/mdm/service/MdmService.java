package ru.rt.eip.boot.mdm.service;

import ru.rt.eip.boot.mdm.model.MdmClient;
import ru.rt.eip.boot.mdm.model.MdmSubscriber;

import java.util.List;
import java.util.Optional;

public interface MdmService {
    MdmClient getClient(String localSystemId, Long applicationId, Long version);
    Optional<MdmClient> getClientByNls(String nls);
    MdmClient getClientFromMapping(String localSystemId, Long applicationId, Long version);
    List<MdmSubscriber> getClientSubscribers(String localSystemId, Long applicationId, Long version);
    MdmSubscriber getSubscriber(String localSystemId, Long applicationId, Long version);

}
