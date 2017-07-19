
// participant: Subject
//      Subject knows its observers and provides an interface for attaching
//              and detaching Observer objects.
public interface Subject {

    void attach(Observer o);

    void detach(Observer o);

    void notifyEvent();
    
    SubjectEvent getState();
    
    void setState(SubjectEvent s);
}
