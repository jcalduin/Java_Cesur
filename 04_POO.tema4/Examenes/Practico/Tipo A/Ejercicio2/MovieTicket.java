package Ejercicio2;

public class MovieTicket extends Ticket {

    public MovieTicket(String ticketNumber, double basePrice) {
        super(ticketNumber, basePrice);
    }

    @Override
    public double calculatePrice(boolean isPeakTime) {
        if (isPeakTime) {
            return getBasePrice() + 2;
        } else {
            return getBasePrice();
        }
    }

    @Override
    public String toString() {
        return "MovieTicket{"+super.toString()+"}";
    }
}
