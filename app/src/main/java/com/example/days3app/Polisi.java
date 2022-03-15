package com.example.days3app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polisi extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[]{"Polres Kuansing", "Polres Kampar", "Polres Inhil", "Polres Rohil"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listRS));
    }


    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);

    }

    private void tampilkanpilihan(String pilihan) {

        try {
            Intent a = null;
            if (pilihan.equals("Polres Kuansing")) {
                a = new Intent(this, PolresKuansing.class);

            } else if (pilihan.equals("RS Eka Hospital")) {

            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
