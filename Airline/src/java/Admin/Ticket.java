
package Admin;

public class Ticket {
    
    
    private int ticketId;
    private String seatNumber;
    private String flightNumber;
    private int bookingId;
    private int price;
    private String date;

    
    
    public Ticket() {
   ticketId=0;
   seatNumber="Not Available";
   flightNumber="Not Available";
   bookingId=0;
   price=0;
   date="Not Available";
        
    }

    public Ticket(int ticketId, String seatNumber, String flightNumber, int bookingId, int price, String date) {
        this.ticketId = ticketId;
        this.seatNumber = seatNumber;
        this.flightNumber = flightNumber;
        this.bookingId = bookingId;
        this.price = price;
        this.date = date;
    }
    
    
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    
    
    
    
    
    
    
}
