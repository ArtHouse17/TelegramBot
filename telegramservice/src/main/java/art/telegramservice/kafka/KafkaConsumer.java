package art.telegramservice.kafka;

import org.jvnet.hk2.annotations.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "art.backendservice.topic", groupId = "1")
    public void listen(String message) {
        System.out.println(message);
    }
}
