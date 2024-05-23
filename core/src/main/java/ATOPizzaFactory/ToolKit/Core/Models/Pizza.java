package ATOPizzaFactory.ToolKit.Core.Models;

import ATOPizzaFactory.ToolKit.Core.Exceptions.PizzaObjectException;
import ATOPizzaFactory.ToolKit.Core.Models.Components.DoughShape;
import ATOPizzaFactory.ToolKit.Core.Models.Components.DoughType;
import ATOPizzaFactory.ToolKit.Core.Models.Components.PizzaSize;
import ATOPizzaFactory.ToolKit.Core.Models.Components.PizzaTopping;

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
