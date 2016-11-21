package builder;

/**
 * Created by user on 02/04/16.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10;
    }
}
