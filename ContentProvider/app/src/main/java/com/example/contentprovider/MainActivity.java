package com.example.contentprovider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CONTACTS_ASK_PERMISSIONS = 1001;
    Button btnreadcontact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();
    }

    private void addEvents() {
        btnreadcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyManHinhDanhBa();
            }
        });
    }

    private void xuLyManHinhDanhBa() {
        Intent intent = new Intent(MainActivity.this,DanhBa.class);
        intent.setClassName("com.example.contentprovider","com.example.contentprovider.DanhBa");
        startActivity(intent);
    }

    private void addControl() {
        btnreadcontact = findViewById(R.id.btn1);
    }
}