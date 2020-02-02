package com.mikecodejunky.android.decibel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.os.Bundle;


public class Settings extends AppCompatActivity {

    private ImageButton settingsReturnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settingsReturnSwitch = findViewById(R.id.settingsReturnButton);

        settingsReturnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToApp();

            }
        });
    }

    private void moveToApp(){

        Intent intent = new Intent(Settings.this, App.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_enter,R.anim.push_right_exit);
    }


}
