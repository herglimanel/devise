package projetMonnaie;

class DollarsConverter implements CurrencyConverter {
    public Currency convertCurrency(Currency sourceCurrency) {
        double dollarsAmount = sourceCurrency.getAmount() * 0.85; // Conversion en Dollars
        return new Dollars(dollarsAmount);
    }
}
