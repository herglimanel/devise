package projetMonnaie;

public class TNDinars extends Currency {
    private String symbol;

    public TNDinars(double amount) {
        super(amount);
        this.symbol = "TND";
    }

    public String getSymbol() {
        return symbol;
    }
}
