package dependencyInversion;

public class BackEndDeveloper implements Developer{
	@Override
	public void writeCode() {
		System.out.println("C# is just Microsoft Java anyway.");
	}
}
