module com.example.fase2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fase2 to javafx.fxml;
    exports com.example.fase2;
}