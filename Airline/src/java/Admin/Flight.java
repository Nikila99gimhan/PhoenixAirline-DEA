
package Admin;

public class Flight {
   
    private String flightNumber;
     private String departure;
      private String returnd;
       private String airport;
        private String destination;
         private int economySeats;
          private int buisinessSeats;
          
          
          
           public Flight(){
     flightNumber="Not Available";
     departure="Not Available";
     returnd="Not Available";
     airport="Not Available";
     destination="Not Available";
     economySeats=0;
     buisinessSeats=0;
     
     
 }
    
    
 public Flight(String flightNumber,String departure,String returnd,String airport,String destination,int economySeats,int buisinessSeats){
    this.flightNumber=flightNumber;
     this.departure=departure;
     this.returnd=returnd;
     this.airport=airport;
     this.destination=destination;
     this.economySeats=economySeats;
    this.buisinessSeats=buisinessSeats; 
 }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getReturnd() {
        return returnd;
    }

    public void setReturnd(String returnd) {
        this.returnd = returnd;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    public int getBuisinessSeats() {
        return buisinessSeats;
    }

    public void setBuisinessSeats(int buisinessSeats) {
        this.buisinessSeats = buisinessSeats;
    }
          
          

 
 
    
}
