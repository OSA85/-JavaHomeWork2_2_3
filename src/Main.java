public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percent = 9.99;
        double creditTime = 12;
        double payment = service.calculate(credit, percent, creditTime);
        int paymentIfOneYear = (int)Math.round(payment);
        System.out.println("Сумма кредита : " + credit);
        System.out.println("Процентная ставка : " + percent);
        System.out.println("Срок кредита : " + creditTime);
        System.out.println("Платеж : " + paymentIfOneYear);
        System.out.println(" ");

        double creditTime2 = 24;
        double payment1 = service.calculate(credit, percent, creditTime2);
        int paymentIfTwoYear = (int)Math.round(payment1);
        System.out.println("Сумма кредита : " + credit);
        System.out.println("Процентная ставка : " + percent);
        System.out.println("Срок кредита : " + creditTime2);
        System.out.println("Платеж : " + paymentIfTwoYear);
        System.out.println(" ");

        double creditTime3 = 36;
        double payment3 = service.calculate(credit, percent, creditTime3);
        int paymentIfThreeYear = (int)Math.round(payment3);
        System.out.println("Сумма кредита : " + credit);
        System.out.println("Процентная ставка : " + percent);
        System.out.println("Срок кредита : " + creditTime3);
        System.out.println("Платеж : " + paymentIfThreeYear);
        System.out.println(" ");
    }
}
