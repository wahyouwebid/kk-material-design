package com.kampuskoding.kampusmaterialdesign.model.carditem;

public class BasicItem {
    String title;
    String subTitle;
    int imageCover;

    public BasicItem() {
    }

    public BasicItem(String title, String subTitle, int imageCover) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageCover = imageCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImageCover() {
        return imageCover;
    }

    public void setImageCover(int imageCover) {
        this.imageCover = imageCover;
    }
}
