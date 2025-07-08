package ato_pizza_factory.tool_kit.core.models;

import java.util.ArrayList;
import java.util.List;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.DoughShape;
import ato_pizza_factory.tool_kit.core.models.components.DoughType;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.components.PizzaTopping;
import ato_pizza_factory.tool_kit.core.utils.PizzaValidatorUtil;

public abstract class Pizza extends PizzaDough implements IPizza {

    protected PizzaSize size;

    protected final List<PizzaTopping> toppings = new ArrayList<>();


    protected Pizza(DoughShape doughShape) throws PizzaObjectException {
        super(DoughType.FLATBREAD, doughShape);
    }


    protected final void validateCustomSizePizza() throws PizzaObjectException {
        PizzaValidatorUtil.validateCustomSizeInRange(this);
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
