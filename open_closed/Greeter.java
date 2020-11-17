package open_closed;

public class Greeter{
    private String greetingType;

    public String greet(Greeting greeting){
        return greeting.greet();
    }

    public void setGreetingType(String greetingType) {
        this.greetingType = greetingType;
    }
}