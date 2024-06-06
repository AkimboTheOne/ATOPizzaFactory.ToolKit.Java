package ato_pizza_factory.tool_kit.core.exceptions;

import ato_pizza_factory.tool_kit.core.codes.IPizzaCode;

public final class PizzaObjectException extends CodeException {
    public PizzaObjectException(IPizzaCode<?> code, String details) {
        super(code, details);
    }
}
