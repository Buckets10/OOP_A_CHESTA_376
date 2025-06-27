package main.com.practicum.gui;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import main.java.com.praktikum.main.LoginSystem;
import main.java.com.praktikum.users.*;

public class LoginPane extends VBox {
    public LoginPane(MainApp mainApp) {
        setSpacing(10);
        setPadding(new Insets(20));
        setAlignment(Pos.CENTER);

        Label title = new Label("Login Lost & Found");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Login");

        Label message = new Label();

        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            User user = LoginSystem.authenticate(username, password);

            if (user != null) {
                if (user instanceof Admin) {
                    mainApp.showAdminDashboard();
                } else if (user instanceof Mahasiswa) {
                    mainApp.showMahasiswaDashboard();
                }
            } else {
                message.setText("Login gagal!");
            }
        });

        getChildren().addAll(title, usernameField, passwordField, loginButton, message);
    }
}
