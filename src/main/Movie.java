package main;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    double getCharge(int daysRenteed) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRenteed > 2)
                    result += (daysRenteed - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRenteed * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (daysRenteed > 3)
                    result += (daysRenteed - 3) * 1.5;
                break;
        }
        return result;
    }

    int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}