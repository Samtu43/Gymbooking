module com.example.gymbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gymbooking to javafx.fxml;
    exports com.example.gymbooking;
}