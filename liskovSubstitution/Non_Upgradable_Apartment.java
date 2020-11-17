package liskovSubstitution;

public abstract class Non_Upgradable_Apartment {
    private int squareFootage;
    private int numberOfBedrooms;

    public abstract void setSquareFootage(int sqft);

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}