package ru.rt.eip.boot.mdm.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rt.eip.boot.mdm.dao.MdmClientRepository;
import ru.rt.eip.boot.mdm.model.MdmClient;
import ru.rt.eip.boot.mdm.model.MdmSubscriber;
import ru.rt.eip.boot.mdm.repository.EntityMappingRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MdmServiceImpl implements MdmService {

    @Autowired
    private MdmClientRepository clientRepository;
    @Autowired
    private EntityMappingRepository mappingRepository;

    @Override
    public MdmClient getClient(String localSystemId, Long applicationId, Long version) {
        return clientRepository.findOne(localSystemId, applicationId, version);
    }

    @Override
    public Optional<MdmClient> getClientByNls(String nls) {
        Stream<MdmClient> s = clientRepository.findByNls(nls).stream();
        s = s.filter(u -> u.getVersion() == 0);
        s = s.limit(1);
        return s.findFirst();
    }

    @Override
    public MdmClient getClientFromMapping(String localSystemId, Long applicationId, Long version) {
        return null;
    }

    @Override
    public List<MdmSubscriber> getClientSubscribers(String localSystemId, Long applicationId, Long version) {
        return null;
    }

    @Override
    public MdmSubscriber getSubscriber(String localSystemId, Long applicationId, Long version) {
        return null;
    }
}
