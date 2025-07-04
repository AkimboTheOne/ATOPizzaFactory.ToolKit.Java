package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundPizzaTest {
    @Test
    void testBuildPersonalRoundPizzaHappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");
    }
    @Test
    void testBuildSmallRoundPizzaHappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.SMALL);

        assertEquals(PizzaSize.SMALL, thePizza.getSize(), "A SMALL size round pizza was created...");
    }
    @Test
    void testBuildMediumRoundPizzaHappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.MEDIUM);

        assertEquals(PizzaSize.MEDIUM, thePizza.getSize(), "A MEDIUM size round pizza was created...");
    }
    @Test
    void testBuildLargeRoundPizzaHappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.LARGE);

        assertEquals(PizzaSize.LARGE, thePizza.getSize(), "A LARGE size round pizza was created...");
    }
    @Test
    void testBuildFamilyRoundPizzaHappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.FAMILY);

        assertEquals(PizzaSize.FAMILY, thePizza.getSize(), "A FAMILY size round pizza was created...");
    }
    @Test
    void testBuildTheBeastRoundPizzaHappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.THE_BEAST);

        assertEquals(PizzaSize.THE_BEAST, thePizza.getSize(), "A THE_BEAST size round pizza was created...");
    }

}