package com.pickship.validator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pickship.enums.PickShipApiStatusCode;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PickShipApiValidationException extends PickShipApiException
{

    public PickShipApiValidationException()
    {
	super();
    }

    public PickShipApiValidationException(PickShipApiStatusCode apiStatusCode)
    {
	super(apiStatusCode);
    }

    public PickShipApiValidationException(String message, PickShipApiStatusCode apiStatusCode)
    {
	super(message, apiStatusCode);
    }

    public PickShipApiValidationException(String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace)
    {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    public PickShipApiValidationException(String message, Throwable cause)
    {
	super(message, cause);
    }

    public PickShipApiValidationException(String message)
    {
	super(message);
    }

    public PickShipApiValidationException(Throwable cause)
    {
	super(cause);
    }

}
