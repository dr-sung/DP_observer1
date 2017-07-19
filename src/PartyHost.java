
// participant: ConcreteSubject

import java.util.ArrayList;


public class PartyHost implements Subject {
    
    private final ArrayList<Observer> attendees;
    private SubjectEvent state; // state of the subject
    
    public PartyHost() {
        attendees = new ArrayList<Observer>();
    }
    
    public void announceParty() {
        this.setState(new SubjectEvent(this, "<<Party Tonight!>>"));
        notifyEvent();
    }

    @Override
    public void attach(Observer o) {
        attendees.add(o);
    }

    @Override
    public void detach(Observer o) {
        attendees.remove(o);
    }

    @Override
    public void notifyEvent() {
        for (Observer o: attendees) {
            o.update(this.getState());
        }
    }

    @Override
    public SubjectEvent getState() {
        return state;
    }

    @Override
    public void setState(SubjectEvent state) {
        this.state = state;
    }
    
}
