package projetMonnaie;

class EuroConverter implements CurrencyConverter {
    public Currency convertCurrency(Currency sourceCurrency) {
        double euroAmount = sourceCurrency.getAmount() * 0.31; // Conversion to Euro
        return new Euro(euroAmount);
    }
}
