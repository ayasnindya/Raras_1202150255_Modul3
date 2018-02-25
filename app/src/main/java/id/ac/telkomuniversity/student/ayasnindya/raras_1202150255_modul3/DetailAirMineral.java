package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailAirMineral extends AppCompatActivity {

    private Button tambah, kurang;
    private ImageView progress, gambar;
    private TextView judul, Detail, Stats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air_mineral);

// Melakukan inisiasi untuk memanggil id
        tambah = findViewById(R.id.Tambah);
        kurang = findViewById(R.id.Kurang);
        progress = findViewById(R.id.isiBatre);

        judul = findViewById(R.id.lblJudul);
        Detail = findViewById(R.id.lblDetail);
        gambar = findViewById(R.id.gambar);
        Stats = findViewById(R.id.Status);

        //untuk menampilkan intent data

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut tincidunt dui. Etiam et tincidunt dolor. Phasellus eu rhoncus sem. Suspendisse laoreet dolor eu nisi dictum congue id ut ipsum. Etiam sagittis sodales urna. Sed condimentum arcu at pretium laoreet. Nam venenatis leo sit amet sodales malesuada. Morbi quis convallis lorem, quis malesuada elit. Integer suscipit mauris et ex finibus, id aliquam nisi maximus. Quisque lacinia suscipit ipsum, in posuere elit eleifend vel. Vestibulum vehicula, est ac interdum tristique, elit odio volutpat ex, eu eleifend erat dolor a mauris.\nInterdum et malesuada fames ac ante ipsum primis in faucibus. Nunc sagittis sagittis orci, a mollis justo ultrices id. Vestibulum a neque eget magna ultricies posuere eget ut sem. Nunc egestas vestibulum metus. Praesent et mi quis dolor pellentesque mattis quis eu turpis. Nunc convallis quis elit vitae ornare. Sed venenatis sed lorem eget posuere. Nam lobortis diam dui, et sollicitudin velit faucibus quis. Donec sit amet neque non diam aliquam imperdiet.\n";}
        int imgRes = in.getIntExtra("eimg",0);

        //untuk menampilkan gambar jika di klik
        setTitle(title);
        judul.setText(title);
        Detail.setText(description);
        gambar.setImageResource(imgRes);

        //untuk membuat agar button + - bisa berfungsi

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }
        //formula agar air bisa terisi

    public void tambahIsi(){
        status();
        if(level==6){
            Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
    }
        //formula agar air mengurang
    public void kurangIsi(){
        status();
        if(level==0){Toast.makeText(this,"Air Kosong",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }
    //untuk menampilkan status air tersebut

    public void status(){
        Stats.setText(""+level+"L");
    }
}
