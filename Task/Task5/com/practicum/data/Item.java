package com.practicum.data;

public class Item {
    private final String itemName;
    private final String description;
    private final String location;
    private String status; // "Reported" or "Claimed"

    public Item(String itemName, String description, String location, String status) {
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.status = status;
    }

    public String getItemName() { return itemName; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Description: " + description);
        System.out.println("Location: " + location);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}