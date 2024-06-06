package ato_pizza_factory.tool_kit.core.utils;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.IPizza;
import ato_pizza_factory.tool_kit.core.models.PizzaCode;
import ato_pizza_factory.tool_kit.core.models.RoundPizza;
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
        IPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");

        assertDoesNotThrow(() -> PizzaValidatorUtil.validateNonNullPizzaObject(thePizza), "The pizza object is not null...");
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_ToShortException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.validateNonNullPizzaObject(new RoundPizza(1)), "The pizza object to short...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_ToLongException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.validateNonNullPizzaObject(new RoundPizza(1000)), "The pizza object to long...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }
}