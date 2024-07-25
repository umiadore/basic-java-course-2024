package classwork39.message;

import java.time.Instant;
import java.util.Objects;

public class Message {
    private int id;
    private Instant createTimestamp; // временнАя метка

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Instant createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;
        return id == message.id && Objects.equals(createTimestamp, message.createTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTimestamp);
    }

    public Message(int id, Instant createTimestamp) {
        this.id = id;
        this.createTimestamp = createTimestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", createTimestamp=" + createTimestamp +
                '}';
    }
}
