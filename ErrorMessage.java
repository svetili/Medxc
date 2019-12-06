package com.dxc.medic;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author spetrova
 *
 */
@XmlRootElement
public class ErrorMessage extends Throwable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String errorMessageValue;
    private String errorMessageKey;

    /**
     *
     */
    public ErrorMessage() {

    }

    /**
     * @param errorMessageValue
     * @param errorMessageKey
     */
    public ErrorMessage(final String errorMessageValue, final String errorMessageKey) {
        super();
        this.errorMessageValue = errorMessageValue;
        this.errorMessageKey = errorMessageKey;
    }

    public String getErrorMessageValue() {
        return errorMessageValue;
    }

    public void setErrorMessageValue(final String errorMessageValue) {
        this.errorMessageValue = errorMessageValue;
    }

    public String getErrorMessageKey() {
        return errorMessageKey;
    }

    public void setErrorMessageKey(final String errorMessageKey) {
        this.errorMessageKey = errorMessageKey;
    }

}
