package Ejercicio2;

public class TrainTicket extends Ticket {

    public TrainTicket(String ticketNumber, double basePrice) {
        super(ticketNumber, basePrice);
    }

    @Override
    public double calculatePrice(boolean isPeakTime) {
        if (isPeakTime) {
            return getBasePrice()*1.10;
        } else {
            return getBasePrice();
        }
    }

    @Override
    public String toString() {
        return "TrainTicket{"+ super.toString() + "}";
    }
}
