/*
 *     Tanggal Pengerjaan : 8/6/2024
 *     Nim : 10121050
 *     Nama : Rio Christian Cesar Sihombing
 *     email :riosihombing047@gmail.com
 *     Copyright © 2024 Rio Sihombing. All rights reserved.
 */
package com.rio.myself.models;

public class MediaObject {

    private String title;
    private String media_url;
    private String thumbnail;
    private String description;

    public MediaObject(String title, String media_url, String thumbnail, String description) {
        this.title = title;
        this.media_url = media_url;
        this.thumbnail = thumbnail;
        this.description = description;
    }

    public MediaObject() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedia_url() {
        return media_url;
    }

    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
