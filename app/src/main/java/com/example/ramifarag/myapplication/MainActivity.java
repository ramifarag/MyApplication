package com.example.ramifarag.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnModeOne;
    Button btnModeTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnModeOne = (Button) findViewById(R.id.btnModeOne);
        btnModeTwo = (Button) findViewById(R.id.btnModeTwo);

        btnModeOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = getSharedPreferences("main", MODE_PRIVATE).edit();
                editor.putInt("modeFlag", 1);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, ModeOneActivity.class);
                startActivity(intent);
            }
        });

        btnModeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = getSharedPreferences("main", MODE_PRIVATE).edit();
                editor.putInt("modeFlag", 2);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, ModeTwoActivity.class);
                startActivity(intent);
            }
        });
    }
}
