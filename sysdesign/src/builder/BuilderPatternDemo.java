package builder;

/**
 * Created by user on 02/04/16.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareVegMeal();
        System.out.println("Veg meals..... ");
        meal.showItems();
        System.out.println("Veg meals costs ... " + meal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg meals ..... ");
        nonVegMeal.showItems();
        System.out.println("Non veg meals costs .... " + nonVegMeal.getCost());

    }
}
