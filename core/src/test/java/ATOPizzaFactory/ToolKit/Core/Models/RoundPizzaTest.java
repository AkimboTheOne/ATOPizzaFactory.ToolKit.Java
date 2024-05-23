package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Exceptions.PizzaObjectException;
import ATOPizzaFactory.ToolKit.Core.Models.Components.PizzaSize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoundPizzaTest {

    @Test
    void someLibraryMethodReturnsTrue() throws PizzaObjectException {
        RoundPizza classUnderTest = new RoundPizza(PizzaSize.SMALL);

        assertEquals(PizzaSize.SMALL, classUnderTest.size, "A SMALL pizza was created...");
    }

}