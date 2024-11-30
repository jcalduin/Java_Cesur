package Ejercicio2;

public class FlightTicket extends Ticket {

    public FlightTicket(String ticketNumber, double basePrice) {
        super(ticketNumber, basePrice);
    }

    @Override
    public double calculatePrice(boolean isPeakTime) {
        if (isPeakTime) {
            return getBasePrice() * 1.2;
        } else {
            return getBasePrice();
        }
    }

    @Override
    public String toString() {
        return "FlightTicket{"+super.toString()+"}";
    }
}
