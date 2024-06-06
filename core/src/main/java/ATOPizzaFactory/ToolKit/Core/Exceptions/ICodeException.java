package ATOPizzaFactory.ToolKit.Core.Exceptions;

public interface ICodeException {
    String getCode();
    String getCodeMessage();
    String getDetails();
    String getExtendedDetails();
}
