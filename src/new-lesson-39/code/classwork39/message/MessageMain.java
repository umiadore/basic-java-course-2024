package classwork39.message;

import java.time.Instant;

public class MessageMain {
    public static void main(String[] args) {
        Message msg = new Message(1, Instant.now()); // c instant почти всегда используется .now()
        System.out.println(msg);
    }
}
