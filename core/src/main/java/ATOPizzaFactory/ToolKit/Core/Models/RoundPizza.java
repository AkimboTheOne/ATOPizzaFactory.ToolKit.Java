package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Exceptions.PizzaObjectException;
import ATOPizzaFactory.ToolKit.Core.Models.Components.*;
import ATOPizzaFactory.ToolKit.Core.Utils.PizzaValidatorUtil;

import java.util.HashMap;

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
        PizzaValidatorUtil.ValidateCustomSizeInRange(this);
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
