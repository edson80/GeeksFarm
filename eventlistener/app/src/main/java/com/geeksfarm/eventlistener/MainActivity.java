package com.geeksfarm.eventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.app.AlertDialog;
import android.view.View;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private EditText fname;
    private EditText phone;
    private EditText mail;

    String var_fname, var_phone, var_mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        fname = (EditText) findViewById(R.id.firstName);
        phone = (EditText) findViewById(R.id.lastName);
        mail = (EditText) findViewById(R.id.address);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);
                builder.setTitle("Pengiriman data");
                builder.setMessage("Pengiriman data dibatalkan ");
                builder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "OK");
                            }
                        });
                builder.show();
                ((EditText) findViewById(R.id.firstName)).setText("");
                ((EditText) findViewById(R.id.lastName)).setText("");
                ((EditText) findViewById(R.id.address)).setText("");

            }


        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var_fname = fname.getText().toString();
                var_phone = phone.getText().toString();
                var_mail = mail.getText().toString();
                Intent i = null;
                i = new Intent(MainActivity.this, Viewdata.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", var_fname);
                b.putString("parse_phone", var_phone);
                b.putString("parse_mail", var_mail);
                i.putExtras(b);
                startActivity(i);

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
