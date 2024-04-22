package bois.chernichkin.task5_builder.logic;

import bois.chernichkin.task5_builder.logic.builders.concreteMemeBuilder;
import bois.chernichkin.task5_builder.model.Meme;
import javafx.scene.image.Image;

import java.io.File;
import java.util.Random;

public class memeDirector {
    private final concreteMemeBuilder memeBuilder;
    private final String[] texts = {
            "Тот момент, когда...",
            "Когда ты осознаешь...",
            "Я, когда пытаюсь...",
            "Когда кто-то спрашивает...",
            "Пытаюсь понять...",
            "Когда случайно...",
            "Тот момент, когда...",
            "Когда ты видишь...",
            "Я, объясняя...",
            "Когда не можешь...",
            "Пытаюсь объяснить...",
            "Когда узнаешь...",
            "Тот неудобный момент, когда...",
            "Когда забываешь...",
            "Я, справляющийся с...",
            "Когда наконец...",
            "Пытаюсь вспомнить...",
            "Тот взгляд, когда...",
            "Когда слышишь...",
            "Пытаюсь игнорировать..."
    };
    private final String[] themes = {
            "Смешно",
            "Неловко",
            "Связано",
            "Саркастично",
            "Запутано",
            "Взволновано",
            "Раздражено",
            "Удивлено",
            "Счастливо",
            "Грустно",
            "Разочаровано",
            "Злой",
            "Весело",
            "Смущенно",
            "Вдохновлено",
            "Сумасшедшее",
            "Лениво",
            "Умно",
            "Глупо",
            "Эпично"
    };

    public memeDirector(concreteMemeBuilder memeBuilder) {
        this.memeBuilder = memeBuilder;
        if(this.memeBuilder == null){
            throw new IllegalArgumentException("No builder error!");
        }
    }
    public Meme createMemes()
    {
        File imagesDirectory = new File("src/main/resources/bois/chernichkin/task5_builder/Images/");
        File[] imageFiles = imagesDirectory.listFiles();
        if (imageFiles != null && imageFiles.length > 0) {
            Random random = new Random();
            File randomImageFile = imageFiles[random.nextInt(imageFiles.length)];
            Image image = new Image(randomImageFile.toURI().toString());

            // Получение случайной фразы из массива строк
            String randomPhrase = texts[random.nextInt(texts.length)];
            String randomTheme = themes[random.nextInt(themes.length)];

            // Генерация мема
            return memeBuilder.setText(randomPhrase).setPicture(image).setTheme(randomTheme).build();
        }
        throw new IllegalArgumentException("Image reading error!");
    }
}
