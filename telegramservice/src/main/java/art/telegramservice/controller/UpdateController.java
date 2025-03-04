package art.telegramservice.controller;

import art.telegramservice.utils.MessageUtils;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class UpdateController {
    private TelegramBot telegramBot;
    private MessageUtils messageUtils;

    public UpdateController(MessageUtils messageUtils) {
        this.messageUtils = messageUtils;
    }

    public void registerBot(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    public void processUpdates(Update update) {
        if (update == null) {
            return;
        }
        if (update.hasMessage() && update.getMessage().hasText()) {
            processTextMessage(update);
        } else {
            setUnsupportedMessageType(update);
        }

    }

    private void setUnsupportedMessageType(Update update) {
        var sendMessage = messageUtils.sendMessage(update, "Данное сообщение не поддерживается!");
        setView(sendMessage);
    }

    private void setView(SendMessage sendMessage) {
        telegramBot.sendAnswerMessage(sendMessage);
    }

    private void processTextMessage(Update update) {
        var sendMessage = messageUtils.sendMessage(update, "Данное сообщение не поддерживается!");
        setView(sendMessage);
    }


}
