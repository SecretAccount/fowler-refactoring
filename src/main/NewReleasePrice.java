package main;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrquentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
