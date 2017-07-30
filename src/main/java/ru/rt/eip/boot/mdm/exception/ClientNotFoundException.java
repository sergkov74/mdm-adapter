package ru.rt.eip.boot.mdm.exception;

import java.util.function.Supplier;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(final String message) {
        super(message);
    }

    public static Supplier<ClientNotFoundException> supplier(final String nls) {
        return () -> new ClientNotFoundException(String.format("User with nls '%s' not found", nls));
    }
}
