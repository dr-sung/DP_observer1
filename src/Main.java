
// Example: Observer design pattern
// (c) Dr. Hong K. Sung

public class Main {
    
    public static void main(String[] args) {
        
        PartyHost host = new PartyHost();
        Observer john = new Kid("John");
        Observer mary = new Kid("Mary");
        Observer ben = new Kid("Ben");
        host.attach(john);
        host.attach(mary);
        host.attach(ben);
        
        host.announceParty();
        
        System.out.println("\n\n---warning: your parents may be watching ------");
        
        Observer parent = new Parent();
        host.attach(parent);
        host.detach(john);
        
        host.announceParty();
        
    }
    
}
