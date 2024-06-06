package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Models.Components.DoughType;
import ATOPizzaFactory.ToolKit.Core.Models.Components.ISizeValue;
import ATOPizzaFactory.ToolKit.Core.Models.Components.SizeReference;

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
