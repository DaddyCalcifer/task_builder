package bois.chernichkin.task5_builder.model;

import javafx.scene.image.Image;

public class Meme {
    private String Text;
    private Image Picture;
    private String Theme;
    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }
    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Image getPicture() {
        return Picture;
    }

    public void setPicture(Image picture) {
        Picture = picture;
    }
}
