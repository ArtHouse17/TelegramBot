package art.telegramservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data

public class BotConfig {
    @Value("${telegram.token}")
    private String token;

    @Value("${telegram.name}")
    private String name;
}
