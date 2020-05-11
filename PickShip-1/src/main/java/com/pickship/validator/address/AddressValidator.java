package com.pickship.validator.address;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.pickship.enums.PickShipApiStatusCode;
import com.pickship.model.request.Address;
import com.pickship.validator.PickShipApiValidationException;
import com.pickship.validator.common.ApiInputValidator;

@Service
@Scope(value =WebApplicationContext.SCOPE_REQUEST)
public class AddressValidator implements ApiInputValidator<Address>
{

    @Override
    public void validate(Address inpute) throws PickShipApiValidationException
    {
	validate(inpute.getLine_1());
    }
    
    private void validate(String line)
    {
	if(line == null)
	{
	    throw new PickShipApiValidationException(PickShipApiStatusCode.NAME_REQUIRED);
	}
    }

}
