package com.example.days3app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class RS extends ListActivity {
    protected  void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Rumah Sakit Awal Bros", "Rumah Sakit Eka Hospitas",
        "Rumah Sakit Jiwa Tampan", "Rumah Sakit Tabrani"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS());
    }

}
