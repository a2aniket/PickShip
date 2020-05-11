package com.pickship.validator.common;

import com.pickship.validator.PickShipApiValidationException;

public interface ApiInputValidator<T>
{
    void validate(T inpute) throws PickShipApiValidationException;
}
