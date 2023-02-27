package Facade;

public class FacadeShopKeeperMain {
    public static void main(String[] args) {
        ShopKeeper shopKeeper=new ShopKeeper();
        shopKeeper.huaweiSale();
        shopKeeper.iphoneSale();
        shopKeeper.samsungSale();
    }
}
