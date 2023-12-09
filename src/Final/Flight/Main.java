package Final.Flight;

public class Main {
    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");

        g1.display();

        int flightNumber = g1.getNumber();
        String flightDestination = g1.getDestination();
    }
}
