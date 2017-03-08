/**
 * Created by davidpvilaca on 08/03/17.
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(shapeType).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }

}
