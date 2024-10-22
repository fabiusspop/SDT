package L02.ChainOfResponsibility;

public class TelephoneNotification implements NotificationService {
    private NotificationService next;

    @Override
    public void setNext(NotificationService next) {
        this.next = next;
    }

    @Override
    public void handleEvent(SensorEvent event) {
        if (event.getType() == SensorEvent.EventType.FIRE ||
                event.getType() == SensorEvent.EventType.INTRUSION) {
            System.out.println("*** CALL MADE FOR:  " + event);
        }
        if (next != null) {
            next.handleEvent(event);
        }
    }
}