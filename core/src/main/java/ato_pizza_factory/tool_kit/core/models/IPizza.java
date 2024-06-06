package ato_pizza_factory.tool_kit.core.models;

import ato_pizza_factory.tool_kit.core.models.components.*;

import java.util.HashMap;
import java.util.List;

public interface IPizza {
    DoughType getDoughType();

    DoughShape getDoughShape();

    PizzaSize getSize();

    HashMap<SizeReference, ISizeValue> getSizeValues();

    double getArea();

    List<PizzaTopping> getToppings();
}
