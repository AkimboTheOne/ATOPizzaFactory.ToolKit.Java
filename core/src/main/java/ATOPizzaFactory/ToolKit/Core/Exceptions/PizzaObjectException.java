package ATOPizzaFactory.ToolKit.Core.Exceptions;

import ATOPizzaFactory.ToolKit.Core.Codes.IPizzaCode;

public final class PizzaObjectException extends CodeException {
    public PizzaObjectException(IPizzaCode<?> code, String details) {
        super(code, details);
    }
}
