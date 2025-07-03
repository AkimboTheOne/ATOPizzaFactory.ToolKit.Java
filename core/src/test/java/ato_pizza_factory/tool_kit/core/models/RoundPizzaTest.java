package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundPizzaTest {

    @ParameterizedTest
    @EnumSource(value = PizzaSize.class, names = {"CUSTOM"}, mode = EnumSource.Mode.EXCLUDE)
    void test_BuildRoundPizza_HappyPath(PizzaSize pizzaSize) throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(pizzaSize);

        assertEquals(pizzaSize, thePizza.getSize(), "A " + pizzaSize + " size round pizza was created...");
    }
}