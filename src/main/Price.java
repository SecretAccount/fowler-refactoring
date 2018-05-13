package main;

public abstract class Price {
    public abstract int getPriceCode();

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


}
