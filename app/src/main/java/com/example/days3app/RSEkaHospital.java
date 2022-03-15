package com.example.days3app;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSEkaHospital extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "SMS Center", "Driving Direction", "Website", "Info Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equals("Call Center")) {
                String notel = "tel:0761-2112121";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(notel));

            } else if (pilihan.equals("SMS Center"))
            {
                String smsText = "Assalamulaikum wr.wb";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:089628561888"));
                a.putExtra("sms_body", smsText);

            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs ="google.navigation:q=0.463823,101.390353";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            }

            else if (pilihan.equals("Website")) {
                String website ="http://haloawalbros.com/";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            }
            else if (pilihan.equals("Info Google")) {
                a= new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bross");
            }

            startActivity(a);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
