import model.Bookings;
import model.Rate;
import model.Shows;

public class Main {
    public static void main(String[] args) {

        Shows s1 = new Shows("Black Panther: Wakanda Forever", "QFX Cinemas", "BigMovies", "FCube Cinemas");
        Shows s2 = new Shows("Mahapurush", "QFX Cinemas", "One Cinemas", "FCube Cinemas");
        Shows s3 = new Shows("Uunchai", "One Cinemas", "BigMovies", "FCube Cinemas");

        s1.getAvailableLocations();
        s2.getAvailableLocations();
        s3.getAvailableLocations();

        Rate r1 = new Rate(350, 500, s1.getMovie());
        Rate r2 = new Rate(300, 500, s2.getMovie());
        Rate r3 = new Rate(350, 500, s3.getMovie());

        r1.getAvailableRates();
        r2.getAvailableRates();
        r3.getAvailableRates();

        Bookings b1 = new Bookings(4, s1.getLocation2(), true, r1.getPremium(), s1.getMovie());
        Bookings b2 = new Bookings(2, s2.getLocation3(), false, r2.getPrice(), s2.getMovie());
        Bookings b3 = new Bookings(6, s3.getLocation1(), true, r3.getPrice(), s3.getMovie());

        b1.getTotal();
        b2.getTotal();
        b3.getTotal();
    }
}