
// participant: ConcreteObserver

public class Parent implements Observer {

    @Override
    public void update(SubjectEvent event) {
        System.out.println("From: " + event.getSubject().getClass());
        System.out.println(   " the parent is notified: " + event.getMessage());
    }
    
}
