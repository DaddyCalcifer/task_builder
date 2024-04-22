package bois.chernichkin.task5_builder.logic.builders;

import bois.chernichkin.task5_builder.logic.IMemeBuilder;
import bois.chernichkin.task5_builder.model.Meme;
import javafx.scene.image.Image;

public class concreteMemeBuilder implements IMemeBuilder {
    private Meme meme;
    public concreteMemeBuilder()
    {
        this.meme = new Meme();
    }
    @Override
    public IMemeBuilder setPicture(Image image) {
        this.meme.setPicture(image);
        return this;
    }

    @Override
    public IMemeBuilder setText(String text) {
        this.meme.setText(text);
        return this;
    }

    @Override
    public IMemeBuilder setTheme(String theme) {
        this.meme.setTheme(theme);
        return this;
    }
    public Meme build() {
        return meme;
    }
}
