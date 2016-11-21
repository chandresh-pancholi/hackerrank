package builder;

/**
 * Created by user on 02/04/16.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15;
    }
}
