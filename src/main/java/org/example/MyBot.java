package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    public MyBotService myBotService = new MyBotService();
    public Tutors tutors = new Tutors();
    public NaimaUstoz naimaUstoz = new NaimaUstoz();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            if (text.equals("/start")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Assalomu aleykum xush kelibsiz ❗\uFE0F");

                try {
                    execute(myBotService.changeLan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Ustozlar uchun \uD83E\uDDD5\uD83C\uDFFB")) {
                try {
                    execute(tutors.tutorsMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Ortga ⬅\uFE0F")) {
                try {
                    execute(myBotService.menuUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Назад ⬅\uFE0F")) {
                try {
                    execute(myBotService.menuRu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Tilni o'zgartirish \uD83C\uDDFA\uD83C\uDDFF/\uD83C\uDDF7\uD83C\uDDFA")) {
                try {
                    execute(myBotService.changeLan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Изменить язык \uD83C\uDDF7\uD83C\uDDFA/\uD83C\uDDFA\uD83C\uDDFF")) {
                try {
                    execute(myBotService.changeLan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Для учителей \uD83E\uDDD5\uD83C\uDFFB")) {
                try {
                    execute(myBotService.registrationRu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Oylik xisobot \uD83C\uDF13")) {
                try {
                    execute(myBotService.chooseMonth(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Naima ustoz")){
                try {
                    execute(naimaUstoz.tutorsRegNaima(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("naima10Afoundation")){
                try {
                    execute(naimaUstoz.tutorNaimaClasses(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            System.out.println(data);

            if (data.equals("uzId")) {
                try {
                    execute(myBotService.menuUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ruId")) {
                try {
                    execute(myBotService.menuRu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("monthly")) {
                try {
                    execute(myBotService.chooseMonth(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("10A_oquvchilar")){
                try {
                    execute(naimaUstoz.oninchiA(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String getBotToken() {
        return "6737895165:AAH4EFCqRIKZxzKLUi160P035W4LF4OsGpg";
    }

    @Override
    public String getBotUsername() {
        return "Davomat_pdp_bot";
    }
}
