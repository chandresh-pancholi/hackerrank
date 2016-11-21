package prototype;

/**
 * Created by user on 02/04/16.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println(" Inside circle ");
    }
}
