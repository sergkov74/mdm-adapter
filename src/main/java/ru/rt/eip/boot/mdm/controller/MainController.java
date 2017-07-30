package ru.rt.eip.boot.mdm.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    private static final Logger log = LogManager.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String readResource() {
        log.debug("mdm-service test1");
        return "It's mdm-service working....Fasa2!";
    }
}