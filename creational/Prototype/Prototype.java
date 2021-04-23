package creational.Prototype;

/*
Prototype pattern refers to creating duplicate object while keeping performance in mind.
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
This pattern involves implementing a prototype interface which tells to create a clone of the current object.
This pattern is used when creation of object directly is costly.
For example, an object is to be created after a costly database operation.
We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
* */
/*We're going to create an abstract class Shape and concrete classes extending the Shape class.
A class ShapeCache is defined as a next step which stores shape objects in a Hashtable and returns their clone when requested.*/
public class Prototype {
    public static void main(String[] args) {
        ShapeCache.loadCache();
//the cast is unnecessary
        Shape clonedShape = (Shape) ShapeCache.getShape("1");

        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
