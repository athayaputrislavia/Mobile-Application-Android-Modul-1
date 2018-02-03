package com.example.athaya.athayaputrislavia_1202150252_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Menu,JumlahPesanan;
    Button ButtonEatbus,ButtonAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu = findViewById(R.id.editText1);
        JumlahPesanan = findViewById(R.id.editText2);
        ButtonEatbus = findViewById(R.id.button1);
        ButtonAbnormal = findViewById(R.id.button2);

        ButtonEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geser = new Intent(MainActivity.this, Main2Activity.class);
                geser.putExtra("tempat", "Eatbus");
                geser.putExtra("namaMenu", Menu.getText().toString());
                geser.putExtra("jumlahPesanan", JumlahPesanan.getText().toString());
                geser.putExtra("Harga", "50000");
                startActivity(geser);
            }
        });

        ButtonAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent geser = new Intent(MainActivity.this, Main2Activity.class);
                geser.putExtra("tempat", "Abnormal");
                geser.putExtra("namaMenu", Menu.getText().toString());
                geser.putExtra("jumlahPesanan", JumlahPesanan.getText().toString());
                geser.putExtra("Harga", "30000");
                startActivity(geser);
            }
        });
    }
}
