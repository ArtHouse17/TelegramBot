package art.telegramservice.controller;


import art.telegramservice.config.BotConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



/**
 * Класс телеграм бота, используется при запуске самого Бота
 */
@Component
public class TelegramBot extends TelegramLongPollingBot {

    private BotConfig config;

    private UpdateController updateController;

    public TelegramBot(BotConfig config, UpdateController updateController) {
        this.config = config;
        this.updateController = updateController;
    }

    /**
     * Метод init предназначен для обработки всех входящих сообщений приходящих в телеграм бот
     * @PostConstruct используется для вызова класса строго после запуска самого бота
     */
    @PostConstruct
    public void init() {
        updateController.registerBot(this);
    }

    @Override
    public String getBotUsername() {
        return config.getName();
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        var message = update.getMessage();
        System.out.println(message.getText());

        updateController.processUpdates(update);

    }

    public void sendAnswerMessage(SendMessage message) {
        if (message.getText() != null) {
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
