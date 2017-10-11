package com.geeksfarm.test.multiplescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        Button btnGo=(Button)findViewById(R.id.btnGo);

        //pada saat button ditekan
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //berpindah screen      (screen sekarang,screen tujuan)
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                //menjalankan perintah Intent
                startActivity(intent);
            }
        });
    }
}
