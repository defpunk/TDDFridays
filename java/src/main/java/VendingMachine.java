public class VendingMachine {


    private float balance = 0;

    public String getDisplay() {
       return "Insert Coins";
    }

    public void insertCoin(String coin){
        if("Dime".equals(coin)){
            balance += 0.1;
        } else if ("Quarter".equals(coin)) {
            balance += 0.25;
        }
        
    }

    public float getBalance() {
        return balance;
    }

}
