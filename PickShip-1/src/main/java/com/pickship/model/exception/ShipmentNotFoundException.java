package com.pickship.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Thrown when a requested Shipment was not found.
 *
 * @author sagar.raut
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShipmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2597141796450907973L;

	/**
	 * Create.
	 *
	 * @param id
	 *            Shipment identifier
	 */
	public ShipmentNotFoundException(final String id) {
		super("Could not find Shipment with id '" + id + "'.");
	}

}
