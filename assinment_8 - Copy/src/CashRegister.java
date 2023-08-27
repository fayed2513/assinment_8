public class CashRegister {
    private double purchase;
    private double amount;
    private double change;
    public CashRegister(){
        purchase = 0;
        amount = 0;
        change = 0;
    }
    public void recordPurchase(double purchase){
        this.purchase = purchase + amount;
    }
    public void  receiveAmount(int coinCount , Coin coinName){
        this.amount = amount + coinCount * coinName.getCoinValue();
    }
    public double giveChange() {
        change = amount - purchase;
        return change;


    }
}
