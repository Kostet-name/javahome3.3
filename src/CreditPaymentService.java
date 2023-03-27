public class CreditPaymentService {
    public double calculate(double amount, double year, double bet) {
        double index = Math.pow(1 + bet / 12 / 100, year * 12);
        double caf = (bet / 12 / 100 * index) / (index - 1);
        double result = amount * caf;
        return result;
    }
}
