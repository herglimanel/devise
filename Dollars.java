package projetMonnaie;

public class Dollars extends Currency {
    private String symbol;

    public Dollars(double amount) {
        super(amount);
        this.symbol = "$";
    }

    public String getSymbol() {
        return symbol;
    }
}