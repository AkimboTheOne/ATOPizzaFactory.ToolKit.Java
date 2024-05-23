package ATOPizzaFactory.ToolKit.Core.Models.Components;

public enum PizzaSize {
    CUSTOM(0, SizeMetric.CM, 2),
    PERSONAL(15, SizeMetric.CM, 4),
    SMALL(20, SizeMetric.CM, 6),
    MEDIUM(30, SizeMetric.CM, 8),
    LARGE(40, SizeMetric.CM, 8),
    FAMILY(60, SizeMetric.CM, 8),
    THE_BEAST(120, SizeMetric.CM, 8);

    public static final double CUSTOM_SIZE_MIN = 10;
    public static final double CUSTOM_SIZE_MAX = 120;

    public static final double STANDARD_SIZE_TOLERANCE = 1;

    private final double standardSizeValue;
    private final SizeMetric standardSizeMetric;
    private final int minExpectedSlices;


    PizzaSize(double standardSizeValue, SizeMetric standardSizeMetric, int minExpectedSlices) {
        this.standardSizeValue = standardSizeValue;
        this.standardSizeMetric = standardSizeMetric;
        this.minExpectedSlices = minExpectedSlices;
    }

    public double getStandardSizeValue() {
        return this.standardSizeValue;
    }

    public SizeMetric getStandardSizeMetric() {
        return this.standardSizeMetric;
    }

    public int getMinExpectedSlices() {
        return this.minExpectedSlices;
    }
}
