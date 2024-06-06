package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.codes.IPizzaCode;

public enum PizzaCode implements IPizzaCode<PizzaCode> {

    NULL_PIZZA_OBJECT("Null pizza object"),

    INVALID_PIZZA_SIZE_TYPE("Invalid pizza type for operation"),
    INVALID_BUILD_SIZE_PARAMS("Invalid pizza building size params"),

    DEFAULT("Default non-specific pizza code");

    private final String message;

    PizzaCode(String message) {
        this.message = message;
    }

    @Override
    public PizzaCode getDefault() {
        return DEFAULT;
    }

    @Override
    public String getAsString() {
        return this.toString();
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
