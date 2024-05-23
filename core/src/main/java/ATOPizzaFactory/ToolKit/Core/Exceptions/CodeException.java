package ATOPizzaFactory.ToolKit.Core.Exceptions;

import ATOPizzaFactory.ToolKit.Core.Codes.ICode;

import java.util.Objects;

public class CodeException extends Exception {

    protected final ICode<? extends Enum<?>> errorCode;

    public CodeException(ICode<? extends Enum<?>> errorCode, String details) {
        super(errorCode.getAsString() + (details != null && !details.isBlank() && !details.isEmpty() ? " . " + details : ""));
        this.errorCode = errorCode;
    }
}
