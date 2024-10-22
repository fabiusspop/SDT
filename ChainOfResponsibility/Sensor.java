package L02.ChainOfResponsibility;

import java.time.LocalDateTime;
import java.util.Random;

public class Sensor implements Runnable {
    private NotificationService chain;

    public Sensor(NotificationService chain) {
        this.chain = chain;
    }

    @Override
    public void run() {
        Random random = new Random();
        SensorEvent.EventType[] eventTypes = SensorEvent.EventType.values();
        String[] locations = {"Room no.1", "Room no.2", "Room no.3", "Room no.4"};

        while (true) {
            SensorEvent event = new SensorEvent(
                    eventTypes[random.nextInt(eventTypes.length)],
                    LocalDateTime.now(),
                    locations[random.nextInt(locations.length)]
            );
            chain.handleEvent(event);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}