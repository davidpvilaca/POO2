/**
 * Created by davidpvilaca on 08/03/17.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        Shape square = ShapeFactory.getShape("Square");
        Shape triangle = ShapeFactory.getShape("Triangle");

        circle.draw();
        square.draw();
        triangle.draw();

    }
}
