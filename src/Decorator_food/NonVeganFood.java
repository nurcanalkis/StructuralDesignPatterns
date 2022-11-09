package Decorator_food;

public class NonVeganFood extends FoodDecorator {
    public NonVeganFood(Food newFood) {
        super(newFood);
        //VeganfoodInstance
    }
    public String prepareFood(){
        return super.prepareFood() +" With Roasted Chicken and Chicken Curry  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+150.0;
    }
}
