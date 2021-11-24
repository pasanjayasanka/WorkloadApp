package com.example.workloadmng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {

    private Button btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btnlog = (Button) findViewById(R.id.button3);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
    }

    public void openProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}