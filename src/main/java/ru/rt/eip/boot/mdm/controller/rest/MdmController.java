package ru.rt.eip.boot.mdm.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rt.eip.boot.mdm.dao.MdmClientRepository;
import ru.rt.eip.boot.mdm.model.MdmClient;

import java.util.List;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/v1/rest")
public class MdmController {

    @Autowired
    private MdmClientRepository clientRepository;


    @RequestMapping(value = "/clients/{localSystemId}/{applicationId}/{version}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Callable<ResponseEntity<MdmClient>> getClient(
            @PathVariable final String localSystemId,
            @PathVariable final Long applicationId,
            @PathVariable final Long version) {
        return () -> ResponseEntity.ok(clientRepository.findOne(localSystemId, applicationId, version));

    }

    @RequestMapping(value = "/clients/{nls}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Callable<ResponseEntity<List<MdmClient>>> getClientByNls(
            @PathVariable final String nls) {
        return () -> ResponseEntity.ok(clientRepository.findByNls(nls));

    }
}
