package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemMenu  {

    private String judul, info, detail;
    private int gambar;
    //class item menu

    public ItemMenu(String judul, String info, String detail, int gambar) {
        this.judul = judul;
        this.info = info;
        this.detail = detail;
        this.gambar = gambar;
    }
    //untuk memanggil ke halaman selanjutnya

    public static Intent toClick(Context context, String title, String desc, @DrawableRes int img){
        Intent in = new Intent(context, DetailAirMineral.class);
        in.putExtra("EXTRA_TITLE",title);
        in.putExtra("EXTRA_DESC",desc);
        in.putExtra("EXTRA_IMG",img);
        return in;
    }
    //untuk mengambil data dari activity lain

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
