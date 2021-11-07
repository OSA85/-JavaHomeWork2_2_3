public class CreditPaymentService {
    public double calculate(double credit, double percent, double creditTime) {
        double percentInMounth = percent / 12 / 100;
        double payment = credit * ((percentInMounth * Math.pow((1 + percentInMounth), creditTime)) / ((Math.pow((1 + percentInMounth), creditTime) - 1)));
        return payment;
    }
}
