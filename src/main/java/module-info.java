module pl.gornik.politycy2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.gornik.politycy2 to javafx.fxml;
    exports pl.gornik.politycy2;
}