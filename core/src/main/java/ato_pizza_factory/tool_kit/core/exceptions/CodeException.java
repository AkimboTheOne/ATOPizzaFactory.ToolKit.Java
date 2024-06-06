package ato_pizza_factory.tool_kit.core.exceptions;

import ato_pizza_factory.tool_kit.core.codes.ICode;

public abstract class CodeException extends Exception implements ICodeException {

    private static final String EXCEPTION_MESSAGE_STRING_FORMAT = "CODE: %s - MESSAGE: %s - DETAILS: %s";
    private static final String EXTENDED_DETAILS_STRING_FORMAT = "%s - details: %s";

    private final ICode<? extends Enum<?>> errorCode;
    private final String details;

    protected CodeException(ICode<? extends Enum<?>> errorCode, String details) {
        super(String.format(EXCEPTION_MESSAGE_STRING_FORMAT, errorCode.getAsString(), errorCode.getMessage(), details.trim()));
        this.errorCode = errorCode;
        this.details = (!details.isEmpty() && !details.isBlank()) ? details.trim() : "no details" ;
    }

    @Override
    public final String getCode() {
        return this.errorCode.getAsString();
    }

    @Override
    public final String getCodeMessage() {
        return this.errorCode.getMessage();
    }

    @Override
    public final String getDetails() {
        return this.details;
    }

    @Override
    public final String getExtendedDetails() {
        return String.format(EXTENDED_DETAILS_STRING_FORMAT, this.errorCode.getMessage(), this.details);
    }
}
