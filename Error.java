package com.dxc.medic;

import java.util.List;

public class Error {
    private ErrorType errorKey;
    private List<Object> errorParams;

    public Error(final ErrorType errorKey, final List<Object> errorParams) {
        this.errorParams = errorParams;
        this.errorKey = errorKey;
    }

    public List<Object> getErrorValue() {
        return errorParams;
    }

    public void setErrorValue(final List<Object> errorValues) {
        this.errorParams = errorValues;
    }

    public ErrorType getErrorKey() {
        return errorKey;
    }

    public void setErrorKey(final ErrorType errorKey) {
        this.errorKey = errorKey;
    }

}