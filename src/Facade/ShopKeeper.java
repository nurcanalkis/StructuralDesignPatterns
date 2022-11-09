package Facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop huawei;
    private MobileShop samsung;

    public ShopKeeper(){
        iphone=new Iphone();
        huawei=new Huawei();
        samsung=new Samsung();
    }
    public void iphoneSale() {
        System.out.println("Iphone sale started");
        iphone.modelNo();
        iphone.price();
    }
    public void huaweiSale(){
        System.out.println("Huawei sale started");
        huawei.modelNo();
        huawei.price();
    }
    public void samsungSale(){
        System.out.println("Samsung sale started");
        samsung.modelNo();
        samsung.price();
    }
}
