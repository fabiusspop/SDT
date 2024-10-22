package L02.ChainOfResponsibility;

public interface NotificationService {
    void setNext(NotificationService next);
    void handleEvent(SensorEvent event);
}