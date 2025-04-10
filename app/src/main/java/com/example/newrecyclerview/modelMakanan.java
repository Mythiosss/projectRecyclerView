package com.example.newrecyclerview;

public class modelMakanan {
    private String namaMakanan;
    private String hargaMakanan;
    private int gambarMakanan;
    private String deskripsiMakanan;

    public modelMakanan(String namaMakanan, String hargaMakanan, int gambarMakanan, String deskripsiMakanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.gambarMakanan = gambarMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public int getGambarMakanan() {
        return gambarMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }
}
