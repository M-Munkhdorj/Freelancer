package com.example.freelancer.Model;

public class Service {
    String type,name,description,deliveryTime,price,imagePath;

    public Service(String type, String name, String description, String deliveryTime, String price, String imagePath) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.deliveryTime = deliveryTime;
        this.price = price;
        this.imagePath = imagePath;
    }

    public Service() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
