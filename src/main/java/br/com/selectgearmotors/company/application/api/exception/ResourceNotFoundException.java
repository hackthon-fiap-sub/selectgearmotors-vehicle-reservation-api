package br.com.selectgearmotors.company.application.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The type Resource found exception.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "O recurso já existe")
public class ResourceNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Resource found exception.
     *
     * @param message the message
     */
    public ResourceNotFoundException(final String message) {
        super(message);
    }

}