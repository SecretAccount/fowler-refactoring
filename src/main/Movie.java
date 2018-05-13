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

    public Price getPrice() {
        return price;
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

    int getFrequentRenterPoints(int daysRented) {
        return price.getFrquentRenterPoints(daysRented);
    }
}