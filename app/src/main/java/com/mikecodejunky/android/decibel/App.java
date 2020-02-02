package com.mikecodejunky.android.decibel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class App extends AppCompatActivity {

    private ImageButton settingsSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        settingsSwitch = findViewById(R.id.settingsButton);

        settingsSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToApp();

            }
        });
    }

    private void moveToApp(){

        Intent intent = new Intent(App.this, Settings.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_enter,R.anim.push_left_exit);
    }

}
