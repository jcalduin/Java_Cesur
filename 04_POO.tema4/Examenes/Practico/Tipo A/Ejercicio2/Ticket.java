package Ejercicio2;

public class Ticket {
    private String ticketNumber;
    private double basePrice;

    public Ticket(String ticketNumber, double basePrice) {
        this.ticketNumber = ticketNumber;
        this.basePrice = basePrice;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }

    public double calculatePrice(boolean isPeakTime) {
        return basePrice;
    }

}
