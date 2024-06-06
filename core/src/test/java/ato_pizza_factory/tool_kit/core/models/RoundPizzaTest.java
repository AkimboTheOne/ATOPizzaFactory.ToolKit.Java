package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundPizzaTest {

    @Test
    void test_BuildPersonalRoundPizza_HappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.PERSONAL);

        assertEquals(PizzaSize.PERSONAL, thePizza.getSize(), "A PERSONAL size round pizza was created...");
    }

    @Test
    void test_BuildSmallRoundPizza_HappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.SMALL);

        assertEquals(PizzaSize.SMALL, thePizza.getSize(), "A SMALL size round pizza was created...");
    }

    @Test
    void test_BuildMediumRoundPizza_HappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.MEDIUM);

        assertEquals(PizzaSize.MEDIUM, thePizza.getSize(), "A MEDIUM size round pizza was created...");
    }

    @Test
    void test_BuildLargeRoundPizza_HappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.LARGE);

        assertEquals(PizzaSize.LARGE, thePizza.getSize(), "A LARGE size round pizza was created...");
    }

    @Test
    void test_BuildFamilyRoundPizza_HappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.FAMILY);

        assertEquals(PizzaSize.FAMILY, thePizza.getSize(), "A FAMILY size round pizza was created...");
    }

    @Test
    void test_BuildTheBeastRoundPizza_HappyPath() throws PizzaObjectException {
        RoundPizza thePizza = new RoundPizza(PizzaSize.THE_BEAST);

        assertEquals(PizzaSize.THE_BEAST, thePizza.getSize(), "A THE_BEAST size round pizza was created...");
    }

}