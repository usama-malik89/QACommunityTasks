package dependencyInversion;

public class Project {
    private BackEndDeveloper back = new BackEndDeveloper();
    private FrontEndDeveloper front = new FrontEndDeveloper();

    public void implement(Developer developer) {
        developer.writeCode();
    }
}