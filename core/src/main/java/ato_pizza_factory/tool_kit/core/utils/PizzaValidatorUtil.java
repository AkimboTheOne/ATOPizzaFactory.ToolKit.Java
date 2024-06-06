package ato_pizza_factory.tool_kit.core.utils;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.components.SizeReference;
import ato_pizza_factory.tool_kit.core.models.IPizza;
import ato_pizza_factory.tool_kit.core.models.PizzaCode;

public class PizzaValidatorUtil {

    private PizzaValidatorUtil() {}

    public static void validateNonNullPizzaObject(IPizza pizza) throws PizzaObjectException {
        if (pizza == null) {
            throw new PizzaObjectException(PizzaCode.NULL_PIZZA_OBJECT,
                    "Referenced pizza is null");
        }
    }

    public static void validateCustomSizeInRange(IPizza pizza) throws PizzaObjectException {
        validateNonNullPizzaObject(pizza);

        if (pizza.getSize() != PizzaSize.CUSTOM)
            throw new PizzaObjectException(PizzaCode.INVALID_PIZZA_SIZE_TYPE,
                    "Size validation only applies for custom size pizza");

        for (SizeReference i : pizza.getDoughShape().getRequiredSizeReferences()) {
            if (!pizza.getSizeValues().containsKey(i))
                throw new PizzaObjectException(PizzaCode.INVALID_BUILD_SIZE_PARAMS,
                        "Required " + i.toString() + " size value not found");
            var ii = pizza.getSizeValues().get(i);
            if (ii.getValue() < PizzaSize.CUSTOM_SIZE_MIN)
                throw new PizzaObjectException(PizzaCode.INVALID_BUILD_SIZE_PARAMS,
                        "Pizza is to short on " + i.toString() + " value, minimum is: " + PizzaSize.CUSTOM_SIZE_MIN + PizzaSize.CUSTOM.getStandardSizeMetric());
            if (ii.getValue() > PizzaSize.CUSTOM_SIZE_MAX)
                throw new PizzaObjectException(PizzaCode.INVALID_BUILD_SIZE_PARAMS,
                        "Pizza is too long " + i.toString() + " value, maximum is: " + PizzaSize.CUSTOM_SIZE_MAX + PizzaSize.CUSTOM.getStandardSizeMetric());
        }
    }
}
