package com.pickship.enums;

public enum PickShipApiStatusCode
{
    NAME_REQUIRED(12,"name can not be empty");
    private final int code;
    private final String reason;
    
    PickShipApiStatusCode(int code,String reason)
    {
	this.code = code;
	this.reason =reason;
    }

    public int getCode()
    {
        return code;
    }

    public String getReason()
    {
        return reason;
    }
    
    


}
