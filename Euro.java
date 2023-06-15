package projetMonnaie;

public class Euro extends Currency {
    private String symbol;

    public Euro(double amount) {
        super(amount);
        this.symbol = "€";
    }

    public String getSymbol() {
        return symbol;
    }
}
