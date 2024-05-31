package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Models.Components.*;

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
