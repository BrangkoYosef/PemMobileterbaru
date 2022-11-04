package com.example.pemmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Detail_barang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);

        public void onClick (View){
                Intent i = new Intent(Barang.this, Barang.class);
        i.putExtra("name", name.getText().toString());
        startActivity(i);
        }
    }
}