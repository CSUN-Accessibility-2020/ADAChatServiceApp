package com.mikecodejunky.android.decibel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectApp extends AppCompatActivity {

    private Button discordSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        discordSwitch = findViewById(R.id.discordButton);

        discordSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToApp();

            }
        });
    }

    private void moveToApp(){

        Intent intent = new Intent(SelectApp.this, App.class);
        startActivity(intent);

    }
}
