package ato_pizza_factory.tool_kit.core.utils;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.IPizza;
import ato_pizza_factory.tool_kit.core.models.PizzaCode;
import ato_pizza_factory.tool_kit.core.models.RoundPizza;
import ato_pizza_factory.tool_kit.core.models.components.SizeMetric;
import ato_pizza_factory.tool_kit.core.models.components.SizeReference;
import ato_pizza_factory.tool_kit.core.models.components.SizeValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaValidatorUtilTest {

    @Test
    void test_PizzaValidatorUtil_validateNonNullPizzaObject_HappyPath() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");

        assertDoesNotThrow(() -> PizzaValidatorUtil.validateNonNullPizzaObject(thePizza), "The pizza object is not null...");
    }

    @Test
    void test_PizzaValidatorUtil_validateNonNullPizzaObject_ThrowsException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.validateNonNullPizzaObject(null), "The pizza object is null...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.NULL_PIZZA_OBJECT.toString(), theException.getCode());
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_HappyPath() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(20);

        assertEquals(PizzaSize.CUSTOM, thePizza.getSize());

        assertDoesNotThrow(() -> PizzaValidatorUtil.validateCustomSizeInRange(thePizza),
                "The custom pizza size is within the allowed range...");
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_ToShortException() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(20);
        // tamper the size to be invalid
        thePizza.getSizeValues().put(SizeReference.DIAMETER, new SizeValue(1, SizeMetric.CM));

        PizzaObjectException theException = assertThrows(PizzaObjectException.class,
                () -> PizzaValidatorUtil.validateCustomSizeInRange(thePizza), "The pizza object too short...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_ToLongException() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(20);
        // tamper the size to be invalid
        thePizza.getSizeValues().put(SizeReference.DIAMETER, new SizeValue(1000, SizeMetric.CM));

        PizzaObjectException theException = assertThrows(PizzaObjectException.class,
                () -> PizzaValidatorUtil.validateCustomSizeInRange(thePizza), "The pizza object too long...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }
}