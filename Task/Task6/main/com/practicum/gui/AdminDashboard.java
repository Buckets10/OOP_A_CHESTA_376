package main.com.practicum.gui;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import main.java.com.praktikum.data.*;

import java.util.ArrayList;

public class AdminDashboard extends VBox {
    private final ArrayList<Item> items = new ArrayList<>();
    private final ListView<String> listView = new ListView<>();

    public AdminDashboard() {
        setSpacing(10);
        setPadding(new Insets(20));

        TextField nameField = new TextField();
        nameField.setPromptText("Nama Barang");

        TextArea descArea = new TextArea();
        descArea.setPromptText("Deskripsi");

        Button addBtn = new Button("Tambah Barang");

        addBtn.setOnAction(e -> {
            String name = nameField.getText();
            String desc = descArea.getText();
            Item item = new Item(name, desc);
            items.add(item);
            updateListView();
            nameField.clear();
            descArea.clear();
        });

        getChildren().addAll(new Label("Admin Dashboard"),
                nameField, descArea, addBtn, listView);
    }

    private void updateListView() {
        listView.getItems().clear();
        for (Item item : items) {
            listView.getItems().add(item.toString());
        }
    }
}
