public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int months = 12;
        int creditAmount = 1_000_000;
        double interestRate = 9.99;
        double monthlyInterestRate = interestRate / 12 / 100;
        double a = monthlyInterestRate + 1;
        // Возведение в степень
        Math.pow(a, months);
        double monthlyPayment = service.calculate(12, 1_000_000, 9.99, interestRate / 12 / 100, monthlyInterestRate + 1);
        System.out.println("Ежемесячный платеж:" + (Math.round(monthlyPayment)));
    }
}