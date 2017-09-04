package airline.model;

public class FlightTicketBooking
{
    public int flightBookingNo;
    public int flightNo;
    public String userName;
    public int seats;

    public int getFlightBookingNo() {
        return flightBookingNo;
    }

    public void setFlightBookingNo(int flightBookingNo) {
        this.flightBookingNo = flightBookingNo;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
