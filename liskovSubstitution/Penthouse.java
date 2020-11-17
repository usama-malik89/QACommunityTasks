package liskovSubstitution;

public class Penthouse extends Upgradable_Apartment{
    public Penthouse() {
        this.setNumberOfBedrooms(4);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(this.getSquareFootage());
    }

	@Override
	public void addBedroom() {
		setSquareFootage(this.getSquareFootage() + 40);
		setNumberOfBedrooms(this.getNumberOfBedrooms() + 1);
	}
}