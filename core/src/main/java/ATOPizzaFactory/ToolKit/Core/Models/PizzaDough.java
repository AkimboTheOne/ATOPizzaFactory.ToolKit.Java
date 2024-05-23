package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Models.Components.DoughShape;
import ATOPizzaFactory.ToolKit.Core.Models.Components.DoughType;

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
