module com.account.account {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.account.account to javafx.fxml;
    exports com.account.account;
}