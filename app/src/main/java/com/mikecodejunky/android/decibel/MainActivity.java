package com.mikecodejunky.android.decibel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button selectSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        selectSwitch = findViewById(R.id.selectButton);

        selectSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToApp();

            }
        });
    }

    private void moveToApp(){

        Intent intent = new Intent(MainActivity.this, SelectApp.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_enter,R.anim.push_left_exit);

    }
}
