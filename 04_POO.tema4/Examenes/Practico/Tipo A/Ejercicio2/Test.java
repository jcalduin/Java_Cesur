package Ejercicio2;

public class Test {
    public static void main(String[] args) {

        TrainTicket trainTicket = new TrainTicket("T123",100);
        FlightTicket flightTicket = new FlightTicket("F456",200);
        MovieTicket movieTicket = new MovieTicket("M789",15);

        boolean isPeakTime = true;
        double total = 0;

        double trainPrice = trainTicket.calculatePrice(isPeakTime);
        System.out.printf("Ticket %s - Precio: %.2f€\n",flightTicket.getTicketNumber(),trainPrice);

        total += trainPrice;

        double flightPrice = flightTicket.calculatePrice(isPeakTime);
        System.out.printf("Ticket %s - Precio: %.2f€\n",flightTicket.getTicketNumber(),flightPrice);

        total += flightPrice;

        double moviePrice = movieTicket.calculatePrice(isPeakTime);
        System.out.printf("Ticket %s - Precio: %.2f€\n",movieTicket.getTicketNumber(),moviePrice);

        total += moviePrice;

        System.out.printf("Total de boletos: %.2f\n",total);
    }
}
