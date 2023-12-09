package Final.Flight;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination) {
        if (isValidNumber(number)) {
            this.number = number;
        } else {
            this.number = 0;
            this.destination = "";
            return;
        }

        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println(number + ", " + destination);
    }

    private boolean isValidNumber(int number) {
        return number > 0;
    }
}
