package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.DoughShape;
import ato_pizza_factory.tool_kit.core.models.components.DoughType;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.components.PizzaTopping;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza extends PizzaDough implements IPizza {

    protected PizzaSize size;

    protected final List<PizzaTopping> toppings = new ArrayList<>();


    protected Pizza(DoughShape doughShape) throws PizzaObjectException {
        super(DoughType.FLATBREAD, doughShape);
    }


    @Override
    public final PizzaSize getSize() {
        return this.size;
    }

    @Override
    public final List<PizzaTopping> getToppings() {
        return this.toppings;
    }
}
