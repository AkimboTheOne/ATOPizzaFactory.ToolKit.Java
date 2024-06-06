package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.models.components.DoughType;
import ato_pizza_factory.tool_kit.core.models.components.ISizeValue;
import ato_pizza_factory.tool_kit.core.models.components.SizeReference;

import java.util.HashMap;

public abstract class Dough {

    protected final DoughType doughType;

    protected HashMap<SizeReference, ISizeValue> sizeValues = new HashMap<>();

    protected Dough(DoughType doughType) {
        this.doughType = doughType;
    }

    public final DoughType getDoughType() {
        return this.doughType;
    }
}
