package com.example.projek2;

import android.widget.Button;
import android.widget.ImageView;

public class AppsModel {

    private int gambar;
    private String judul;
    private String desc;
    private Button lihat;

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Button getLihat() {
        return lihat;
    }

    public void setLihat(Button lihat) {
        this.lihat = lihat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
