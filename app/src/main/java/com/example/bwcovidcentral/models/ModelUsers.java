package com.example.bwcovidcentral.models;

public class ModelUsers {
    String name, email, search, idNo, image, uid, cover;

    public ModelUsers(String name, String email, String search, String idNo, String image, String uid, String cover) {
        this.name = name;
        this.email = email;
        this.search = search;
        this.idNo = idNo;
        this.image = image;
        this.uid = uid;
        this.cover = cover;
    }

    public ModelUsers() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSearch() {
        return search;
    }

    public String getIdNum() {
        return idNo;
    }

    public String getImage() {
        return image;
    }

    public String getUid() {
        return uid;
    }

    public String getCover() { return cover; }
}
