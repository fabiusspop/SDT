package L02.ChainOfResponsibility;

import java.time.LocalDateTime;

public class SensorEvent {
    public enum EventType {FIRE, INTRUSION, WATER, TEMPERATURE}

    private EventType type;
    private LocalDateTime timestamp;
    private String location;

    public SensorEvent(EventType type, LocalDateTime timestamp, String location) {
        this.type = type;
        this.timestamp = timestamp;
        this.location = location;
    }

    public EventType getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "SensorEvent{" +
                "type=" + type +
                ", timestamp=" + timestamp +
                ", location='" + location + '\'' +
                '}';
    }
}