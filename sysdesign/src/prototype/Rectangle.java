package prototype;

/**
 * Created by user on 02/04/16.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println(" Inside Rectangle ");
    }
}
