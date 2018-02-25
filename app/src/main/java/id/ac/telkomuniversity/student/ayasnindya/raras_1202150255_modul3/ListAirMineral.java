package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListAirMineral extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;

    public static ArrayList<ItemMenu> DATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_air_mineral);

        //inisiasi data

        DATA = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList);
        mAdapter = new MenuAdapter(DATA);
        recyclerView.setAdapter(mAdapter);
        //agar tampilan bisa dalam orientasi lanskap maka diatur grid column nya

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
    //ini arraylist datanya

    public ArrayList<ItemMenu> isi(){
        ArrayList<ItemMenu> data = new ArrayList<>();
        data.add(new ItemMenu("Aqua","Ini adalah air Mineral Merk AQUA ","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new ItemMenu("Vit","Ini adalah air Mineral Merk Vit","",R.drawable.vit));
        data.add(new ItemMenu("Pristine","Ini adalah air Mineral Merk Pristine","Pristine dengan kandungan Alkaline Water yang berisi air basa yang ber Ph 8+, dapat berfungsi untuk mengecilkan pori-pori sehingga kulit wajah akan menjadi lebih kencang. Jika kamu bermasalah dengan flek hitam, tidak perlu khawatir",R.drawable.pristine));
        data.add(new ItemMenu("Le Minerale","Ini adalah air Mineral Merk Le Minerale","Le Minerale, air mineral murni dan terawetkan bersumber dari gunung dan dikemas langsung di tempat menggunakan teknologi terkini (sistem proteksi mineral) untuk memberi Anda penyegaran yang sehat untuk fungsi tubuh yang optimal.",R.drawable.leminerale));
        data.add(new ItemMenu("Amidis","Ini adalah air Mineral Merk Amidis","",R.drawable.amidis));
        data.add(new ItemMenu("Cleo","Ini adalah air Mineral Merk Cleo","",R.drawable.cleo));
        data.add(new ItemMenu("Club","Ini adalah air Mineral Merk Club","",R.drawable.club));
        data.add(new ItemMenu("Equil","Ini adalah air Mineral Merk Equil","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new ItemMenu("Evian","Ini adalah Air Mineral Merk Evian","",R.drawable.evian));
        data.add(new ItemMenu("Nestle","Ini adalah air Mineral Merk Nestle","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));


        return data;
    }
}


