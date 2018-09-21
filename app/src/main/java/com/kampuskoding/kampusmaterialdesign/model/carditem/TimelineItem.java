package com.kampuskoding.kampusmaterialdesign.model.carditem;

public class TimelineItem {
    private String name;
    private String date;
    private int imgProfile;
    private int imgCover;
    private String description;

    public TimelineItem(){}

    public TimelineItem(String name, String date, int imgProfile, int imgCover, String description){
        this.name = name;
        this.date = date;
        this.imgProfile = imgProfile;
        this.imgCover = imgCover;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public int getImgCover() {
        return imgCover;
    }

    public void setImgCover(int imgCover) {
        this.imgCover = imgCover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
