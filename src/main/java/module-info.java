module com.example.lp1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires opencsv;


    opens com.example.lp1 to javafx.fxml;
    exports com.example.lp1;
}