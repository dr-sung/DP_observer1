
// participant: ConcreteObserver

public class Kid implements Observer {
    
    private final String name;
    
    public Kid(String name) {
        this.name = name;
    }

    @Override
    public void update(SubjectEvent event) {
        System.out.println("From: " + event.getSubject().getClass());
        System.out.println(    name + " is notified: " + event.getMessage());
    }
    
}
