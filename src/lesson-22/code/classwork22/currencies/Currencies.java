package classwork22.currencies;

public enum Currencies { // enum - enumeration
        EURO(1),
        USD(1.06),
        TL(34.42);

        //  double[] coefficients = {1, 1.06, 34.42};
        // описываем свойства коэфициента

        private final double coefficient;

        Currencies(double coefficient) {
            this.coefficient = coefficient;
        }
        public double getCoefficient () {
            return coefficient;
        }
    public static double exchange (Currencies initialCurrency, double amount, Currencies targetCurrency) {
        amount /= initialCurrency.coefficient;
        amount *= targetCurrency.coefficient;

        return  amount;
    }
}

