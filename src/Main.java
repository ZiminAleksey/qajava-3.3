public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditService = new CreditPaymentService();
        long monthlyRate1 = creditService.calculate(1, 1_000_000);
        System.out.println("Сумма ежемесячного платежа по кредиту составляет: " + monthlyRate1 + " рубля(ей)");

        long monthlyRate2 = creditService.calculate(2, 1_000_000);
        System.out.println("Сумма ежемесячного платежа по кредиту составляет: " + monthlyRate2 + " рубля(ей)");

        long monthlyRate3 = creditService.calculate(3, 1_000_000);
        System.out.println("Сумма ежемесячного платежа по кредиту составляет: " + monthlyRate3 + " рубля(ей)");

    }
}
