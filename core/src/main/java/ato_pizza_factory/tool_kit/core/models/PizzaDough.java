package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.models.components.DoughShape;
import ato_pizza_factory.tool_kit.core.models.components.DoughType;

public abstract class PizzaDough extends Dough {

    protected final DoughShape doughShape;

    protected PizzaDough(DoughType doughType, DoughShape doughShape) {
        super(doughType);
        this.doughShape = doughShape;
    }

    public final DoughShape getDoughShape() {
        return this.doughShape;
    }
}
