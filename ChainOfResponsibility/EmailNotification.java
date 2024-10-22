package L02.ChainOfResponsibility;

public class EmailNotification implements NotificationService {
    private NotificationService next;

    @Override
    public void setNext(NotificationService next) {
        this.next = next;
    }

    @Override
    public void handleEvent(SensorEvent event) {
        if (event.getType() == SensorEvent.EventType.FIRE ||
                event.getType() == SensorEvent.EventType.INTRUSION ||
                event.getType() == SensorEvent.EventType.WATER) {
            System.out.println("*** EMAIL SENT FOR: " + event);
        }
        if (next != null) {
            next.handleEvent(event);
        }
    }
}