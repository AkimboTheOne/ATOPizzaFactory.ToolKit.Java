package ATOPizzaFactory.ToolKit.Core.Builders;

import ATOPizzaFactory.ToolKit.Core.Models.Components.DoughShape;
import ATOPizzaFactory.ToolKit.Core.Models.Pizza;

public interface IPizzaBuilder {
    Pizza buildPlainPizza(DoughShape doughShape);
}
