package model;

public class Shows {
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getLocation1() {
        return location1;
    }

    public void setLocation(String location) {
        this.location1 = location1;
    }

    String movie;
    String location1;
    String location2;
    String location3;

    public String getAvailableLocations() {
        System.out.println("The Available Locations for "+this.movie+" are:\n"+this.location1+"\n"+this.location2+"\n"+this.location3+"\n\n");
        return availableLocations;
    }

    public void setAvailableLocations(String availableLocations) {
        this.availableLocations = availableLocations;
    }

    String availableLocations;

    public Shows(String availableLocations) {
        this.availableLocations = availableLocations;
    }

    public Shows(String movie, String location1, String location2, String location3) {
        this.movie = movie;
        this.location1 = location1;
        this.location2 = location2;
        this.location3 = location3;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public String getLocation3() {
        return location3;
    }

    public void setLocation3(String location3) {
        this.location3 = location3;
    }
}
