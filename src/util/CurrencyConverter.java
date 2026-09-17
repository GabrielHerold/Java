package util;

public class CurrencyConverter {

    //public double percent = 6.0;
    public double price;
    public double dollar;

    public double total() {
        return price * dollar;
    }

    public double percent(){
        return total() * 6.0 / 100;
    }

    public double discount() {
        return total() + percent();
    }

}
