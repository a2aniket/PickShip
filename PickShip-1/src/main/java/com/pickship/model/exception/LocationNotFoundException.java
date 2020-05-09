package com.pickship.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Thrown when a requested location was not found.
 *
 * @author sagar.raut
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class LocationNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2597141796450907973L;

	/**
	 * Create.
	 *
	 * @param id
	 *            maintenance point location identifier
	 */
	public LocationNotFoundException(final String id) {
		super("Could not find diliver point location with id '" + id + "'.");
	}

}
