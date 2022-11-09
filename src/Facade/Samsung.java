package Facade;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Z fold");
    }

    @Override
    public void price() {
        System.out.println("40000 TL");

    }
}
