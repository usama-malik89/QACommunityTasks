package dependencyInversion;

public class FrontEndDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("JavaScript is used everywhere anyway.");
	}
}