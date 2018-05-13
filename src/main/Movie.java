package main;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private Price price;

    public Movie(String title, int newPriceCode) {
        this.title = title;
        setPriceCode(newPriceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Not a valid Price Code");
        }
    }

    public String getTitle() {
        return title;
    }

    double getCharge(int daysRenteed) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                price = new
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