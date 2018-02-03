package com.example.athaya.athayaputrislavia_1202150252_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView namaTempat;
    TextView namaMenu;
    TextView Jumlah;
    TextView jumlahHarga;
    private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaTempat = findViewById(R.id.textView11);
        namaMenu = findViewById(R.id.textView6);
        Jumlah = findViewById(R.id.textView8);
        jumlahHarga = findViewById(R.id.textView10);

        Intent satu = getIntent();

        String Tempat=satu.getStringExtra("tempat");
        String Menu=satu.getStringExtra("namaMenu");
        String jumlah=satu.getStringExtra("jumlahPesanan");
        String JumlahHarga=satu.getStringExtra("Harga");

        int TotalHarga = Integer.valueOf(JumlahHarga) * Integer.valueOf(jumlah);

        namaTempat.setText(Tempat);
        namaMenu.setText(Menu);
        Jumlah.setText(jumlah);
        jumlahHarga.setText(String.valueOf(TotalHarga));

        if (TotalHarga <= uang) {
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }

    }
}
