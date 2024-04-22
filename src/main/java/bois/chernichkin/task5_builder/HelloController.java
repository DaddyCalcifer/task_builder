package bois.chernichkin.task5_builder;

import bois.chernichkin.task5_builder.logic.builders.concreteMemeBuilder;
import bois.chernichkin.task5_builder.logic.memeDirector;
import bois.chernichkin.task5_builder.model.Meme;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView memePic;
    private memeDirector mDirector;

    @FXML
    protected void onHelloButtonClick() {
        Meme memes = mDirector.createMemes();
        welcomeText.setText("[" + memes.getTheme() + "] " + memes.getText());
        memePic.setImage(memes.getPicture());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mDirector = new memeDirector(new concreteMemeBuilder());
    }
}