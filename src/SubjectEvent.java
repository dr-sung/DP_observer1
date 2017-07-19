
public class SubjectEvent {

    private Subject subject;
    private String message;

    public SubjectEvent(Subject subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
