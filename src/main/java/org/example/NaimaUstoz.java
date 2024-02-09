package org.example;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import java.util.ArrayList;
import java.util.List;

public class NaimaUstoz {

    public SendMessage tutorsRegNaima(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Naima ustoz parolingizni kiriting");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        reply.setResizeKeyboard(true);
        button.setText("Ortga ⬅\uFE0F");
        row.add(button);
        rows.add(row);

        reply.setKeyboard(rows);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage tutorNaimaClasses(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sinfingizni tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("10-A");
        row.add(button);
        button.setCallbackData("10A_oquvchilar");
        rows.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("8-A");
        button.setCallbackData("8A_oquvchilar");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("6-A");
        button.setCallbackData("6A_oquvchilar");
        row.add(button);
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage oninchiA(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'ninchi A sinfi davomati");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Rahimov Mustafo");
        button.setCallbackData("rhm10A");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        button.setText("Allayarov Ahad");
        button.setCallbackData("ahad10A");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Azadov Doston");
        button.setCallbackData("doston10A");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

}
