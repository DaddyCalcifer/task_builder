module bois.chernichkin.task5_builder {
    requires javafx.controls;
    requires javafx.fxml;


    opens bois.chernichkin.task5_builder to javafx.fxml;
    exports bois.chernichkin.task5_builder;
}