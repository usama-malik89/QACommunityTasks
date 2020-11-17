package liskovSubstitution;

public class Studio extends Non_Upgradable_Apartment{
    public Studio() {
        this.setNumberOfBedrooms(0);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(sqft);
    }
}