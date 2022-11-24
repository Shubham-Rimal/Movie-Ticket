package model;

public class Bookings {
    int noOfSeats;
    String location;
    Boolean is3d;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    int rate;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    String movie;

    public int getTotal() {
        int amount = this.rate*this.noOfSeats;
        if(is3d){
            total =amount+(50*this.noOfSeats);
            System.out.println("The final price for booking of "+this.movie+" in "+this.location+" is: Rs."+total);
        }else{
            total=amount;
            System.out.println("The final price for booking of "+this.movie+" in "+this.location+" is: Rs."+total);
        };
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    int total;

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bookings(int noOfSeats, String location, Boolean is3d, int rate, String movie) {
        this.noOfSeats = noOfSeats;
        this.location = location;
        this.is3d = is3d;
        this.rate = rate;
        this.total = total;
        this.movie = movie;
    }
}
