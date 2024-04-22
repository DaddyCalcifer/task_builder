package bois.chernichkin.task5_builder.logic;

import bois.chernichkin.task5_builder.model.Meme;
import javafx.scene.image.Image;

public interface IMemeBuilder {
    public IMemeBuilder setPicture(Image image);
    public IMemeBuilder setText(String text);
    public IMemeBuilder setTheme(String theme);
    public Meme build();
}
