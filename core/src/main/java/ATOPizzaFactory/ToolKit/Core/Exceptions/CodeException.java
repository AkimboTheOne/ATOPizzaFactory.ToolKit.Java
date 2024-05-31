package ATOPizzaFactory.ToolKit.Core.Exceptions;

import ATOPizzaFactory.ToolKit.Core.Codes.ICode;

public abstract class CodeException extends Exception implements ICodeException {

    private static final String EXCEPTION_MESSAGE_STRING_FORMAT = "CODE: %s - MESSAGE: %s - DETAILS: %s";
    private static final String EXTENDED_DETAILS_STRING_FORMAT = "%s - details: %s";

    private final ICode<? extends Enum<?>> errorCode;
    private String details = "no details";

    public CodeException(ICode<? extends Enum<?>> errorCode, String details) {
        super(String.format(EXCEPTION_MESSAGE_STRING_FORMAT, errorCode.getAsString(), errorCode.getMessage(), details.trim()));
        this.errorCode = errorCode;
        this.setDetails(details);
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

    private void setDetails(String details) {
        if (details != null && !details.isEmpty() && !details.isBlank()) this.details = details.trim();
    }

    @Override
    public final String getExtendedDetails() {
        return String.format(EXTENDED_DETAILS_STRING_FORMAT, this.errorCode.getMessage(), this.details);
    }
}
