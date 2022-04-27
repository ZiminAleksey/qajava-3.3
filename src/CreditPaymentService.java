public class CreditPaymentService {
    public long calculate(int years, int amountCredit) {
        int mounts = years * 12;
        double creditRate = 9.99;
        double monthlyRate = creditRate / 100 / 12;
        long monthlyPayment = (long) (amountCredit * (monthlyRate + (monthlyRate / (Math.pow((1 + monthlyRate), mounts) - 1))));
        return monthlyPayment;

    }

}
