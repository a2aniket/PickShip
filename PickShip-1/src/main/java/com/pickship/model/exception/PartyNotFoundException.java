package com.pickship.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * party not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PartyNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * All args contructor.
     * @param id party identifier
     */
    public PartyNotFoundException(final String id) {
        super("Could not find Party with id '" + id + "'.");
    }

}
