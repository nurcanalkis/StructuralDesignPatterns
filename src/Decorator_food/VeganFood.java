package Decorator_food;

public class VeganFood implements Food{
    @Override
    public String prepareFood() {
        return "Vegan Food";
    }

    @Override
    public double foodPrice() {
        return 100;
    }
}
