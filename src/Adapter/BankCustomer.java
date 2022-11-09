package Adapter;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        setAccHolderName("Nurcan AB");
        setAccNumber(278456);
        setBankName("isBankasi");
    }

    @Override
    public String getCreditCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "+bname+
                " bank is valid and authenticated for issuing the credit card. ");
    }
}
