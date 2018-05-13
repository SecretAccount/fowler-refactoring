package test;

import main.Movie;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class RentalTest {

    @Test
    public void testRentalConstructorMovie() {
        Movie movie = new Movie("", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 0);

        assertSame(movie, rental.getMovie());
    }

    @Test
    public void testRentalConstructorDayCount() {
        int rentalDayCount = 5;

        Movie movie = new Movie("", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, rentalDayCount);

        assertEquals(rentalDayCount, rental.getDaysRented());
    }

}

