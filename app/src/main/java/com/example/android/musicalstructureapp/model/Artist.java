package com.example.android.musicalstructureapp.model;

public class Artist {

    private Long id;
    private String name;
    private Integer imageId;

    public Artist(Long id, String name, Integer imageId) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}