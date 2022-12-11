public class CreditPaymentService {
    public double calculate(double amount, double term, double percent) {

        double percentAtMonth = percent / term / 100; // Процентная ставка в месяц

        double sum;
        sum = 1 + percentAtMonth;

        double coefficient;
        coefficient = (percentAtMonth * Math.pow(sum, term) / (Math.pow(sum, term) - 1));
        double payment = amount * coefficient;


        return payment;
    }


}
