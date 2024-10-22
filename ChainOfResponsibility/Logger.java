package L02.ChainOfResponsibility;

public class Logger implements NotificationService {
    private NotificationService next;

    @Override
    public void setNext(NotificationService next) {
        this.next = next;
    }

    @Override
    public void handleEvent(SensorEvent event) {
        System.out.println("*** EVENT " + event + " LOGGED ^.^ ***");
        if (next != null) {
            next.handleEvent(event);
        }
    }
}