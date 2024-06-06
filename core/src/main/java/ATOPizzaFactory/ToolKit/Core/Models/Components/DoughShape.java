package ATOPizzaFactory.ToolKit.Core.Models.Components;

import java.util.List;

public enum DoughShape {
    ROUND(List.of(SizeReference.DIAMETER)),
    SQUARE(List.of(SizeReference.WIDTH, SizeReference.DEEP)),
    RECTANGULAR(List.of(SizeReference.WIDTH, SizeReference.DEEP));

    private final List<SizeReference> requiredSizeReferences;

    DoughShape(List<SizeReference> requiredSizeReferences) {
        this.requiredSizeReferences = requiredSizeReferences;
    }

    public List<SizeReference> getRequiredSizeReferences() {
        return this.requiredSizeReferences;
    }
}
