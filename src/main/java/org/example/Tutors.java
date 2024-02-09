package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Tutors {

    public SendMessage tutorsMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tutorning ism familiyasini tanlashingizni soraymiz");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Naima ustoz");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        button.setText("Zilola ustoz");
        row.add(button);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Moxichehra ustoz");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        row = new KeyboardRow();
        button.setText("Ortga ⬅\uFE0F");
        row.add(button);
        rows.add(row);

        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

}
