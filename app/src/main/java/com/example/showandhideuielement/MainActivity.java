package com.example.showandhideuielement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button showBtn;
    Button hideBtn;
    ImageView sunsystImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        runApp();

    }

    private void runApp() {
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sunsystImageView.setVisibility(View.VISIBLE);
            }
        });

        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sunsystImageView.setVisibility(View.INVISIBLE);
            }
        });

    }

    public void initView(){
        showBtn = findViewById(R.id.showBtn);
        hideBtn = findViewById(R.id.hideBtn);
        sunsystImageView = findViewById(R.id.sunsystemImgView);
    }
}