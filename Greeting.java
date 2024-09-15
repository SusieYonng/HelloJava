
public class Greeting {
    private String greeting = "Hello World";
    
    public Greeting(String greeting) {
        this.greeting = greeting;
    }
    
    public void greet() {
        System.out.println(greeting);
    }
    
    public static void main(String[] args) {
        Greeting greeting = new Greeting("Hello java");
        greeting.greet();
    }
}