package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Photo {
    @JsonProperty("id")
    private int id;
    @JsonProperty("img_src")
    private String img_src;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", imageSource='" + img_src + '\'' +
                '}';
    }
}
