package Facade;

public class Iphone implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("Iphone14");
    }

    @Override
    public void price() {
        System.out.println("50000 TL");

    }
}
