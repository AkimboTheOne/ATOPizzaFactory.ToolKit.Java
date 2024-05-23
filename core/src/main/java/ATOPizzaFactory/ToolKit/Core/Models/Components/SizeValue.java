package ATOPizzaFactory.ToolKit.Core.Models.Components;

import java.io.Serializable;

public class SizeValue implements ISizeValue, Serializable {

    double value;
    SizeMetric metric;

    public SizeValue(double value, SizeMetric metric) {
        this.value = value;
        this.metric = metric;
    }

    @Override
    public Double getValue() {
        return this.value;
    }

    @Override
    public SizeMetric getMetric() {
        return this.metric;
    }
}
