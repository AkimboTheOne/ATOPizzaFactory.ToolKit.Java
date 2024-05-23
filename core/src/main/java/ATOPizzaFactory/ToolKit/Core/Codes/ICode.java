package ATOPizzaFactory.ToolKit.Core.Codes;

public interface ICode<E extends Enum<E>> {
    E getDefault();

    String getAsString();

    String getMessage();
}
