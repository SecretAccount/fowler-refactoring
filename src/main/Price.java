package main;

public abstract class Price {
    public abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrquentRenterPoints(int daysRented) {
        return 1;
    }

}
