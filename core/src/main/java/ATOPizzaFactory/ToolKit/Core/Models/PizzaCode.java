package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Codes.IPizzaCode;

public enum PizzaCode implements IPizzaCode<PizzaCode> {
    DEFAULT("Default non-specific code."),

    INVALID_BUILD_SIZE_PARAMS("Invalid building pizza size params.");

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
