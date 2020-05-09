package com.pickship.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * illegal state transition exception.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalStateTransitionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * All args contructor.
     *
     * @param originalState previous state
     * @param event         event to trigger state change
     */
    public IllegalStateTransitionException(final String originalState, final String event) {
        super("Cannot change state from " + originalState + " via " + event);
    }
}
