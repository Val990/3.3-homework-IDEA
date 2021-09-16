public class CreditPaymentService {
        public double calculate(double months, double creditAmount, double interestRate, double monthlyInterestRate, double a) {
        double monthlyPayment = ((monthlyInterestRate * Math.pow(a, months)) / (Math.pow(a, months) - 1) * creditAmount);
        return monthlyPayment;
    }
}
