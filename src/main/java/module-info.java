module com.afropretastech.afropretastech {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.afropretastech.afropretastech to javafx.fxml;
    exports com.afropretastech.afropretastech;
}