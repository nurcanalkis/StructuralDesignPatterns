package Decorator_shape;

public class Rectangle implements Shape{
    // Overriding the method
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
