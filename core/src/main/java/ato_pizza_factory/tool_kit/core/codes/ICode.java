package ato_pizza_factory.tool_kit.core.codes;

public interface ICode<E extends Enum<E>> {
    E getDefault();

    String getAsString();

    String getMessage();
}
