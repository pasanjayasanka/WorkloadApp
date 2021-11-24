package com.example.workloadmng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    private Button btnStart;
    private Button btnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnStart = (Button) findViewById(R.id.button4);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGetStart();
            }
        });

        btnUpload = (Button) findViewById(R.id.button5);
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartUpload();
            }
        });
    }

    public void openGetStart(){
        Intent intent = new Intent(this, GetStart.class);
        startActivity(intent);
    }

    public void openStartUpload(){
        Intent intent = new Intent(this, StartUpload.class);
        startActivity(intent);
    }
}