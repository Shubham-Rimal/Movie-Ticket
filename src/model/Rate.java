package model;

public class Rate {
    int price;
    int premium;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    String movie;

    public String getAvailableRates() {
        System.out.println("The Available Rates for "+this.movie+" are:\n"+this.price+"\n"+this.premium+"\n\n");
        return availableRates;
    }

    public void setAvailableRates(String availableRates) {
        this.availableRates = availableRates;
    }

    String availableRates;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public Rate(int price, int premium, String movie) {
        this.price = price;
        this.premium = premium;
        this.availableRates = availableRates;
        this.movie = movie;
    }
}
