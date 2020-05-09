package com.pickship.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Site not found exception.
 * mapped to Http status @link {HttpStatus.NOT_FOUND}
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class SiteNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3618787939908977846L;

    /**
     * All args contructor.
     * @param id site identifier
     */
    public SiteNotFoundException(final String id) {
        super("Could not find site with id '" + id + "'.");
    }

}
