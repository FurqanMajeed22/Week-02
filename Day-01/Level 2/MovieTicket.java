class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
 
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Free"; // Initially, the seat is not booked
        this.price = 0.0; // Initially, no price is set
    }
    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked for movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price:" + price);
    }
    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket1 = new MovieTicket("Game of Thrones");
        // Book the ticket and display details
        ticket1.bookTicket("A11", 15.00);
        ticket1.displayTicketDetails();
        // Create another MovieTicket object and book a ticket
        MovieTicket ticket2 = new MovieTicket("Spider-Man: No Way Home");
        ticket2.bookTicket("B700", 18.00);
        ticket2.displayTicketDetails();
    }
}
