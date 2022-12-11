public class Main {
    public static void main(String[] args) {
        double amount = 1_000_000; // Сумма кредита
        double term = 12; //Срок погашения кредита
        double percent = 9.99; // Процентная ставка годовая
        CreditPaymentService service = new CreditPaymentService();
        //double payment = service.calculate(amount,term,percent);
        System.out.println();
        System.out.println("1_000_000, 12, 9.99");
        System.out.println("1. Ежемесячный платеж  " + service.calculate(1_000_000, 12, 9.99));
        System.out.println();
        System.out.println("1_000_000, 24, 9.99");
        System.out.println("2. Ежемесячный платеж  " + service.calculate(1_000_000, 24, 9.99));
        System.out.println();
        System.out.println("1_000_000, 36, 9.99");
        System.out.println("3. Ежемесячный платеж  " + service.calculate(1_000_000, 36, 9.99));
    }


}