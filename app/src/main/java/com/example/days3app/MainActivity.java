package com.example.days3app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan);
    }

    public void clickPol(View view) {

        //gambar RS di click
        Intent i = new Intent(this, Polisi.class);
        startActivity(i);
    }
}