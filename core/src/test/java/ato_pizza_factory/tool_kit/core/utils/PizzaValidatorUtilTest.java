package ato_pizza_factory.tool_kit.core.utils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.IPizza;
import ato_pizza_factory.tool_kit.core.models.PizzaCode;
import ato_pizza_factory.tool_kit.core.models.RoundPizza;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.components.SizeMetric;
import ato_pizza_factory.tool_kit.core.models.components.SizeReference;
import ato_pizza_factory.tool_kit.core.models.components.SizeValue;

class PizzaValidatorUtilTest {
    
    static final String AN_EXCEPTION_WAS_THROWN_MESSATE_STRING = "An exception was thrown (assertNotNull)...";

    @Test
    void testPizzaValidatorUtilValidateNonNullPizzaObjectHappyPath() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");

        assertDoesNotThrow(() -> PizzaValidatorUtil.validateNonNullPizzaObject(thePizza), "The pizza object is not null...");
    }

    @Test
    void testPizzaValidatorUtilValidateNonNullPizzaObjectThrowsException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.validateNonNullPizzaObject(null), "The pizza object is null...");

        assertNotNull(theException, AN_EXCEPTION_WAS_THROWN_MESSATE_STRING);
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.NULL_PIZZA_OBJECT.toString(), theException.getCode());
    }

    @Test
    void testPizzaValidatorUtilValidateCustomSizeInRangeHappyPath() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(20);

        assertEquals(PizzaSize.CUSTOM, thePizza.getSize());

        assertDoesNotThrow(() -> PizzaValidatorUtil.validateCustomSizeInRange(thePizza),
                "The custom pizza size is within the allowed range...");
    }

    @Test
    void testPizzaValidatorUtilValidateCustomSizeInRangeTooShortException() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(20);
        // tamper the size to be invalid
        thePizza.getSizeValues().put(SizeReference.DIAMETER, new SizeValue(1, SizeMetric.CM));

        PizzaObjectException theException = assertThrows(PizzaObjectException.class,
                () -> PizzaValidatorUtil.validateCustomSizeInRange(thePizza), "The pizza object too short...");

        assertNotNull(theException, AN_EXCEPTION_WAS_THROWN_MESSATE_STRING);
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }

    @Test
    void testPizzaValidatorUtilValidateCustomSizeInRangeTooLongException() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(20);
        // tamper the size to be invalid
        thePizza.getSizeValues().put(SizeReference.DIAMETER, new SizeValue(1000, SizeMetric.CM));

        PizzaObjectException theException = assertThrows(PizzaObjectException.class,
                () -> PizzaValidatorUtil.validateCustomSizeInRange(thePizza), "The pizza object too long...");

        assertNotNull(theException, AN_EXCEPTION_WAS_THROWN_MESSATE_STRING);
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }


}