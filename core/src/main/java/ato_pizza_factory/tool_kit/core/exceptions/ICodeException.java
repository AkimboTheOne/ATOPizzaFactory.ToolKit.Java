package ato_pizza_factory.tool_kit.core.exceptions;

public interface ICodeException {
    String getCode();
    String getCodeMessage();
    String getDetails();
    String getExtendedDetails();
}
