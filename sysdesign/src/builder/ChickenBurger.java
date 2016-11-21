package builder;

/**
 * Created by user on 02/04/16.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 22;
    }
}
