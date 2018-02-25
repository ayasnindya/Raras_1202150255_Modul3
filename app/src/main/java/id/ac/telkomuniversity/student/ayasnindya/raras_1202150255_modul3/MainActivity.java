package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi data

        final EditText username = (EditText) findViewById(R.id.userName);
        final EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.Login);

        //ketika tombol login dipencet

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_ =  password.getText().toString();
                if (user_name.equals("EAD")&&pass_.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
                    Intent list = new Intent(getApplicationContext(),ListAirMineral.class);
                    startActivity(list);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Password tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
