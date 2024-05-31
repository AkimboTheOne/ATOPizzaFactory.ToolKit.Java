package ATOPizzaFactory.ToolKit.Core.Utils;

import ATOPizzaFactory.ToolKit.Core.Exceptions.PizzaObjectException;
import ATOPizzaFactory.ToolKit.Core.Models.Components.PizzaSize;
import ATOPizzaFactory.ToolKit.Core.Models.IPizza;
import ATOPizzaFactory.ToolKit.Core.Models.PizzaCode;
import ATOPizzaFactory.ToolKit.Core.Models.RoundPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaValidatorUtilTest {

    @Test
    void test_PizzaValidatorUtil_validateNonNullPizzaObject_HappyPath() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");

        assertDoesNotThrow(() -> PizzaValidatorUtil.ValidateNonNullPizzaObject(thePizza), "The pizza object is not null...");
    }

    @Test
    void test_PizzaValidatorUtil_validateNonNullPizzaObject_ThrowsException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.ValidateNonNullPizzaObject(null), "The pizza object is null...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.NULL_PIZZA_OBJECT.toString(), theException.getCode());
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_HappyPath() throws PizzaObjectException {
        IPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");

        assertDoesNotThrow(() -> PizzaValidatorUtil.ValidateNonNullPizzaObject(thePizza), "The pizza object is not null...");
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_ToShortException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.ValidateNonNullPizzaObject(new RoundPizza(1)), "The pizza object to short...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }

    @Test
    void test_PizzaValidatorUtil_validateCustomSizeInRange_ToLongException() throws PizzaObjectException {
        PizzaObjectException theException;

        theException = assertThrows(PizzaObjectException.class, () -> PizzaValidatorUtil.ValidateNonNullPizzaObject(new RoundPizza(1000)), "The pizza object to long...");

        assertNotNull(theException, "An exception was thrown...");
        assertEquals(PizzaObjectException.class, theException.getClass());

        assertEquals(PizzaCode.INVALID_BUILD_SIZE_PARAMS.toString(), theException.getCode());
    }
}