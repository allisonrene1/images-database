package com.images.demo.Model;

public class ImageInformation {

    private int image_id;

    private String title;

    private String cloudinary_id;

    private String image_url;

    public ImageInformation(int image_id, String title, String cloudinary_id, String image_url) {
        this.image_id = image_id;
        this.title = title;
        this.cloudinary_id = cloudinary_id;
        this.image_url = image_url;
    }


    public ImageInformation() {

    };

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCloudinary_id() {
        return cloudinary_id;
    }

    public void setCloudinary_id(String cloudinary_id) {
        this.cloudinary_id = cloudinary_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
