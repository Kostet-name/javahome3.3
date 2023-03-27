public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        //amount = Сумма кредита в руб.
        //year = Срок в г.
        //bet = Ставка в %
        double result = service.calculate(1_000_000, 3, 9.99);
        int payment = (int) result;
        System.out.println("Ваш ежемесячный платеж= " + payment + " руб.");
    }
}