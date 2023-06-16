
package projetMonnaie;


public class Currency {
    protected double amount;
    protected String symbol;
    
    
    public Currency(String symbol, double amount) {
        this.symbol = symbol;
        this.amount = amount;
    }

    public Currency(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

	public String getSymbol() {
		// TODO Auto-generated method stub
		return null;
	}
}
