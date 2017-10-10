package com.geeksfarm.eventlistener;

/**
 * Created by Lost Soul on 8/3/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Viewdata extends AppCompatActivity {

    TextView nama,alamat,email;
    String get_nama,get_alamat,get_email;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_data);

        nama = (TextView) findViewById(R.id.nama_textView);
        alamat = (TextView) findViewById(R.id.phone_textView);
        email = (TextView) findViewById(R.id.email_textView);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");
        get_alamat = b.getString("parse_phone");
        get_email = b.getString("parse_mail");

        nama.setText("Nama : "+get_nama);
        alamat.setText("Alamat : "+get_alamat);
        email.setText("email : "+get_email);

    }
}

