package ato_pizza_factory.tool_kit.core.models;

import java.util.HashMap;

import ato_pizza_factory.tool_kit.core.exceptions.PizzaObjectException;
import ato_pizza_factory.tool_kit.core.models.components.DoughShape;
import ato_pizza_factory.tool_kit.core.models.components.ISizeValue;
import ato_pizza_factory.tool_kit.core.models.components.PizzaSize;
import ato_pizza_factory.tool_kit.core.models.components.SizeMetric;
import ato_pizza_factory.tool_kit.core.models.components.SizeReference;
import ato_pizza_factory.tool_kit.core.models.components.SizeValue;
import ato_pizza_factory.tool_kit.core.utils.PizzaValidatorUtil;

public final class RoundPizza extends Pizza {

    public RoundPizza(PizzaSize pizzaSize) throws PizzaObjectException {
        super(DoughShape.ROUND);
        super.size = pizzaSize;
        super.sizeValues.put(SizeReference.DIAMETER, new SizeValue(pizzaSize.getStandardSizeValue(), pizzaSize.getStandardSizeMetric()));
    }

    public RoundPizza(double customSize) throws PizzaObjectException {
        super(DoughShape.ROUND);
        super.size = PizzaSize.CUSTOM;
        super.sizeValues.put(SizeReference.DIAMETER, new SizeValue(customSize, SizeMetric.CM));
        PizzaValidatorUtil.validateCustomSizeInRange(this);
    }

    @Override
    public HashMap<SizeReference, ISizeValue> getSizeValues() {
        return this.sizeValues;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow((super.sizeValues.get(SizeReference.DIAMETER).getValue() / 2), 2);
    }

}
