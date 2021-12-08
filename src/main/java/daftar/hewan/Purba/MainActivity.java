package daftar.hewan.Purba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnGajah,btnIkan,btnburung;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnGajah = findViewById(R.id.btn_buka_ras_Gajah);
        btnIkan = findViewById(R.id.btn_buka_ras_Ikan);
        btnburung= findViewById(R.id.btn_buka_ras_Burung);
        btnGajah.setOnClickListener(view -> bukaGaleri("Gajah"));
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
        btnburung.setOnClickListener(view -> bukaGaleri("Burung"));
    }
    public void btn_profil(View View) {
        Intent intent = new Intent(MainActivity.this, daftar.hewan.Purba.R.class);
        startActivity(intent);
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, daftar.hewan.Purba.R.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}