package ru.rt.eip.boot.mdm.exception;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;

public class ExceptionHandler extends BaseExceptionHandler {

    public ExceptionHandler(Logger log) {
        super(log);

        registerMapping(ClientNotFoundException.class, "USER_NOT_FOUND", "User not found", HttpStatus.NOT_FOUND);
        registerMapping(NotImplementedException.class, "NOT_IMPLEMENTED", "Not implemented yet", HttpStatus.NOT_IMPLEMENTED);
        registerMapping(InvalidSearchParamException.class, "INVALID_PARAM", "Invalid search parameter", HttpStatus.BAD_REQUEST);
    }
}
