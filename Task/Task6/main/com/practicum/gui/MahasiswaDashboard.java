package main.com.practicum.gui;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class MahasiswaDashboard extends VBox {
    public MahasiswaDashboard() {
        setSpacing(10);
        setPadding(new Insets(20));

        Label label = new Label("Selamat Datang Mahasiswa!");
        TextArea reportArea = new TextArea();
        reportArea.setPromptText("Laporkan barang yang hilang...");

        Button submitBtn = new Button("Kirim Laporan");

        submitBtn.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Laporan dikirim!");
            alert.showAndWait();
            reportArea.clear();
        });

        getChildren().addAll(label, reportArea, submitBtn);
    }
}
