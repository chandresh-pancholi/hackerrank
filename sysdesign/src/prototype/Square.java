package prototype;

/**
 * Created by user on 02/04/16.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println(" Inside Square ");
    }
}
