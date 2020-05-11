
package com.pickship.validator;

import com.pickship.enums.PickShipApiStatusCode;

public class PickShipApiException extends RuntimeException
{
    PickShipApiStatusCode apiStatusCode;

    public PickShipApiException()
    {
	super();
    }

    public PickShipApiException(PickShipApiStatusCode apiStatusCode)
    {
	super(apiStatusCode.getReason());
	this.apiStatusCode = apiStatusCode;
    }

    public PickShipApiException(String message, PickShipApiStatusCode apiStatusCode)
    {
	super(message);
	this.apiStatusCode = apiStatusCode;
    }

    public PickShipApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    public PickShipApiException(String message, Throwable cause)
    {
	super(message, cause);
    }

    public PickShipApiException(String message)
    {
	super(message);
    }

    public PickShipApiException(Throwable cause)
    {
	super(cause);
    }

}
