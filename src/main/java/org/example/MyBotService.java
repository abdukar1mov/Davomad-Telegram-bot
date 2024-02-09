package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBotService {
    public SendMessage changeLan(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga qulay bo'lgan tilni tanlang \uD83C\uDDFA\uD83C\uDDFF/\uD83C\uDDF7\uD83C\uDDFA");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Uzb \uD83C\uDDFA\uD83C\uDDFF");
        button.setCallbackData("uzId");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        button.setText("Ru \uD83C\uDDF7\uD83C\uDDFA");
        button.setCallbackData("ruId");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage menuUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Istalgan menuni tanlang \uD83D\uDDD2");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Ustozlar uchun \uD83E\uDDD5\uD83C\uDFFB");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        button.setText("Oylik xisobot \uD83C\uDF13");
        row.add(button);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Kundalik 〽\uFE0F");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Tilni o'zgartirish \uD83C\uDDFA\uD83C\uDDFF/\uD83C\uDDF7\uD83C\uDDFA");
        row.add(button);
        rows.add(row);

        reply.setResizeKeyboard(true);
        reply.setKeyboard(rows);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage menuRu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите нужное меню \uD83D\uDDD2");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Для учителей \uD83E\uDDD5\uD83C\uDFFB");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
            button.setText("Ежемесячный отчет \uD83C\uDF13");
        row.add(button);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Дневник 〽\uFE0F");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Изменить язык \uD83C\uDDF7\uD83C\uDDFA/\uD83C\uDDFA\uD83C\uDDFF");
        row.add(button);
        rows.add(row);

        reply.setResizeKeyboard(true);
        reply.setKeyboard(rows);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage registrationUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Accountingizga kirish uchun login va parolingizni kiriting");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Login");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        button.setText("Parol");
        row.add(button);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Kirish ✅");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Ortga ⬅\uFE0F");
        row.add(button);
        rows.add(row);

        reply.setResizeKeyboard(true);
        reply.setKeyboard(rows);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage registrationRu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Введите логин и пароль для доступа к своему аккаунту");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Логин");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        button.setText("Пароль");
        row.add(button);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Доступ ✅");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Назад ⬅\uFE0F");
        row.add(button);
        rows.add(row);

        reply.setResizeKeyboard(true);
        reply.setKeyboard(rows);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage chooseMonth(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qaysi oyning oylik ko'rsatkich baxolarni ko'rmoqchisiz?");
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Dekabr");
        button.setCallbackData("dekabr_monthly");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        button.setText("Yanvar");
        button.setCallbackData("yanvar_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Fevral");
        button.setCallbackData("fevral_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Mart");
        button.setCallbackData("mart_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("Aprel");
        button.setCallbackData("aprel_monthly");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        button.setText("May");
        button.setCallbackData("May_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Iyun");
        button.setCallbackData("iyun_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Iyul");
        button.setCallbackData("iyul_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("Avgust");
        button.setCallbackData("avgust_monthly");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        button.setText("Sentabr");
        button.setCallbackData("sentabr_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Oktabr");
        button.setCallbackData("oktabr_monthly");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Noyabr");
        button.setCallbackData("noyabr_monthly");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

}
