package com.example.food_ordering_app.Activity;

import java.io.Serializable;

public class FoodDomain implements Serializable {
    private String title;
    private String description;
    private String picUrl;
    private double price;
    private int time;
    private double score;
    private int energy;
    private int numberinCart;

    public FoodDomain(String title, String description, String picUrl, double price, int time, double score, int energy) {
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.price = price;
        this.time = time;
        this.score = score;
        this.energy = energy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getNumberinCart() {
        return numberinCart;
    }

    public void setNumberinCart(int numberinCart) {
        this.numberinCart = numberinCart;
    }
}