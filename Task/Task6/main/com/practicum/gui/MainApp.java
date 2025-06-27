package main.com.practicum.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showLogin();
        primaryStage.setTitle("Lost & Found App");
        primaryStage.show();
    }

    public void showLogin() {
        LoginPane loginPane = new LoginPane(this);
        primaryStage.setScene(new Scene(loginPane, 400, 300));
    }

    public void showAdminDashboard() {
        AdminDashboard adminDashboard = new AdminDashboard();
        primaryStage.setScene(new Scene(adminDashboard, 600, 400));
    }

    public void showMahasiswaDashboard() {
        MahasiswaDashboard mhsDashboard = new MahasiswaDashboard();
        primaryStage.setScene(new Scene(mhsDashboard, 600, 400));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
