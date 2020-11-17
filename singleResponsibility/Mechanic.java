package singleResponsibility;

public class Mechanic {
    private String colour;

    // functionality
    public void changeColour(String colour){
        this.setColour(this.getColour() + colour);
    }

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
    
    
}
